package com.techienotes.sample;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new User("foo", "$2a$10$7VN.Ui5JQMbX78T9K3fczex.Z.R0gR1tL9YT0.B2cgAmV61FSWPWO",
                new ArrayList<>());
    }
}