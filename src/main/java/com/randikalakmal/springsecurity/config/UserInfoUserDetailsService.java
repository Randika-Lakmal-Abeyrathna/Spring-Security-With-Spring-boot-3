package com.randikalakmal.springsecurity.config;

import com.randikalakmal.springsecurity.entity.UserInfo;
import com.randikalakmal.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserInfoUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserInfo> userInfo = userRepository.findByName(username);

        return userInfo.map(UserInfoUserDetails::new)
                .orElseThrow(()->new UsernameNotFoundException("user not found "+username));
    }
}
