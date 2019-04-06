package com.em.demo.java.springwebapp.service;

import com.em.demo.java.springwebapp.model.entity.User;
import com.em.demo.java.springwebapp.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void getAllTest() {
        when(userRepository.findAll()).thenReturn(new ArrayList<>(List.of(new User(1L, "Anna", "Johnes"))));
        List<User> result = userService.getAll();
        assertEquals(1,result.size());
    }

    @Test
    public void saveTest() {
        User u1 = new User();
        u1.setFirstName("Daniela");
        u1.setLastName("Hirsch");
        User user = new User(1L, "Daniela", "Hirsch");
        when(userRepository.save(u1)).thenReturn(user);
        User userSaved = userService.save(u1);
        assertEquals(user, userSaved);
    }
}
