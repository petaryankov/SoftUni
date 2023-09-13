package softuni.exam.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.data.convert.Jsr310Converters;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.BorrowingRecordsImportDTO;
import softuni.exam.models.dto.BorrowingRecordsWrapper;
import softuni.exam.models.dto.RecordsExportDTO;
import softuni.exam.models.entity.Book;
import softuni.exam.models.entity.BorrowingRecord;
import softuni.exam.models.entity.Genre;
import softuni.exam.models.entity.LibraryMember;
import softuni.exam.repository.BookRepository;
import softuni.exam.repository.BorrowingRecordRepository;
import softuni.exam.repository.LibraryMemberRepository;
import softuni.exam.service.BorrowingRecordsService;
import softuni.exam.util.ValidationUtils;
import softuni.exam.util.XmlParser;

import javax.swing.text.DateFormatter;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static softuni.exam.util.Constants.*;

@Service
public class BorrowingRecordsServiceImpl implements BorrowingRecordsService {

    private final BorrowingRecordRepository borrowingRecordRepository;
    private final BookRepository bookRepository;
    private final LibraryMemberRepository libraryMemberRepository;
    private final ValidationUtils validationUtils;
    private final ModelMapper modelMapper;

    private final XmlParser xmlParser;

    public BorrowingRecordsServiceImpl(BorrowingRecordRepository borrowingRecordRepository,
                                       BookRepository bookRepository,
                                       LibraryMemberRepository libraryMemberRepository,
                                       ValidationUtils validationUtils,
                                       ModelMapper modelMapper,
                                       XmlParser xmlParser) {
        this.borrowingRecordRepository = borrowingRecordRepository;
        this.bookRepository = bookRepository;
        this.libraryMemberRepository = libraryMemberRepository;
        this.validationUtils = validationUtils;
        this.modelMapper = modelMapper;
        this.xmlParser = xmlParser;
    }

    @Override
    public boolean areImported() {
        return this.borrowingRecordRepository.count() > 0;
    }

    @Override
    public String readBorrowingRecordsFromFile() throws IOException {
        return Files.readString(Path.of(BORROWING_RECORDS_URL));
    }

    @Override
    public String importBorrowingRecords() throws IOException, JAXBException {
        StringBuilder sb = new StringBuilder();

        List<BorrowingRecordsImportDTO> records = this.xmlParser.fromFile(Path.of(BORROWING_RECORDS_URL).toFile(), BorrowingRecordsWrapper.class)
                .getBorrowingRecordsImportDTOS();
        for (BorrowingRecordsImportDTO record : records) {
            sb.append(System.lineSeparator());

            Optional<Book> optionalBook = this.bookRepository.findBookByTitle(record.getBook().getTitle());
            Optional<LibraryMember> optionalLibraryMember = this.libraryMemberRepository.findById(record.getMember().getId());

            if (!this.validationUtils.isValid(record)
                    || optionalBook.isEmpty()
                    || optionalLibraryMember.isEmpty()) {
                sb.append(INVALID_B_RECORD);
                continue;
            }
            final BorrowingRecord recordToSave = this.modelMapper.map(record, BorrowingRecord.class);
            recordToSave.setBook(optionalBook.get());
            recordToSave.setMember(optionalLibraryMember.get());
            recordToSave.setBorrowDate(LocalDate.parse(record.getBorrowDate()));
            recordToSave.setReturnDate(LocalDate.parse(record.getReturnDate()));

            BorrowingRecord savedRecord = this.borrowingRecordRepository.save(recordToSave);
            sb.append(String.format(SUCCESSFUL_B_RECORD,
                    savedRecord.getBook().getTitle(),
                    savedRecord.getBorrowDate()));

        }

        return sb.toString().trim();
    }

    @Override
    public String exportBorrowingRecords() {

        return this.borrowingRecordRepository.findAllByBook_GenreOrderByBorrowDateDesc(Genre.SCIENCE_FICTION)
                .stream()
                .map(record -> this.modelMapper.map(record, RecordsExportDTO.class))
                .map(RecordsExportDTO::toString)
                .collect(Collectors.joining())
                .trim();
    }
}
