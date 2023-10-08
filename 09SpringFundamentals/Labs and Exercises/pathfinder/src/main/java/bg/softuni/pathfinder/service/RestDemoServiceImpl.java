package bg.softuni.pathfinder.service;

import bg.softuni.pathfinder.model.entity.User;
import bg.softuni.pathfinder.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestDemoServiceImpl implements RestDemoService {
    private final UserRepository userRepository;

    public RestDemoServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
