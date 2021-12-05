package com.in2min.learning.jpa.jpain2steps;

import com.in2min.learning.jpa.jpain2steps.entity.User;
import com.in2min.learning.jpa.jpain2steps.service.UserDAOService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {


   // private static final Loger log= LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {

        User user=new User("Jack","Admin");
        userDAOService.insert(user);

    }
}
