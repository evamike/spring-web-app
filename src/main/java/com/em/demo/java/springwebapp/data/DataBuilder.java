package com.em.demo.java.springwebapp.data;

import com.em.demo.java.springwebapp.model.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataBuilder {

    public List<User> createUsers() {
        User u1 = new User(1L, "Marie", "Anne");
        User u2 = new User(2L, "John", "Doe");
        User u3 = new User(3L, "George", "Baker");
        return List.of(u1, u2, u3);
    }

}
