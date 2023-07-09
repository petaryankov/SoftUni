package com.softuni.springdataintrolab;

import com.softuni.springdataintrolab.models.User;
import com.softuni.springdataintrolab.services.AccountService;
import com.softuni.springdataintrolab.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {

    public ConsoleRunner(AccountService accountService, UserService userService) {
        this.accountService = accountService;
        this.userService = userService;
    }

    private AccountService accountService;

    private UserService userService;
    @Override
    public void run(String... args) throws Exception {
        User newUser1 = new User("newUser1", 22);
        userService.register(newUser1);
    }
}
