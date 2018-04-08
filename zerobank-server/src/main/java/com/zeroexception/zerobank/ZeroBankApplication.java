package com.zeroexception.zerobank;

import com.zeroexception.zerobank.model.entity.User;
import com.zeroexception.zerobank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class ZeroBankApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepo;
    public static void main(String[] args) {
        SpringApplication.run(ZeroBankApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Set<String> phoneList = new HashSet<>();
        phoneList.add("4692158745");
        phoneList.add("2149652151");
        User user = new User()
                .setFirstName("VImal")
                .setLastsName("Apala")
                .setPhoneNumberList(phoneList);
        this.userRepo.save(user);
        user =  new User()
                .setLastsName("Tran")
                .setFirstName("Viet")
                .setPhoneNumberList(phoneList);

        this.userRepo.save(user);
    }
}
