package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.LibraryMemberImportDTO;
import softuni.exam.models.entity.LibraryMember;
import softuni.exam.repository.LibraryMemberRepository;
import softuni.exam.service.LibraryMemberService;
import softuni.exam.util.ValidationUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static softuni.exam.util.Constants.*;

@Service
public class LibraryMemberServiceImpl implements LibraryMemberService {

    private final LibraryMemberRepository libraryMemberRepository;
    private final Gson gson;
    private final ModelMapper modelMapper;
    private final ValidationUtils validationUtils;

    public LibraryMemberServiceImpl(LibraryMemberRepository libraryMemberRepository, Gson gson, ModelMapper modelMapper, ValidationUtils validationUtils) {
        this.libraryMemberRepository = libraryMemberRepository;
        this.gson = gson;
        this.modelMapper = modelMapper;
        this.validationUtils = validationUtils;
    }

    @Override
    public boolean areImported() {
        return this.libraryMemberRepository.count() > 0;
    }

    @Override
    public String readLibraryMembersFileContent() throws IOException {
        return Files.readString(Path.of(LIBRARY_MEMBERS_URL));
    }

    @Override
    public String importLibraryMembers() throws IOException {
        StringBuilder sb = new StringBuilder();

        List<LibraryMemberImportDTO> members = Arrays.stream(this.gson.fromJson(readLibraryMembersFileContent(), LibraryMemberImportDTO[].class))
                .collect(Collectors.toList());

        for (LibraryMemberImportDTO member : members) {
            sb.append(System.lineSeparator());

            Optional<LibraryMember> optionalLibraryMember = this.libraryMemberRepository
                    .findLibraryMemberByPhoneNumber(member.getPhoneNumber());
            if (!this.validationUtils.isValid(member) || optionalLibraryMember.isPresent()) {
                sb.append(INVALID_MEMBER);
                continue;

            }
            LibraryMember memberToSave = this.modelMapper.map(member, LibraryMember.class);
            LibraryMember savedMember = this.libraryMemberRepository.save(memberToSave);
            sb.append(String.format(SUCCESSFUL_MEMBER,
                    savedMember.getFirstName(),
                    savedMember.getLastName()));
        }

        return sb.toString().trim();
    }
}
