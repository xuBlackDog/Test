package com.config;

import com.work.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @authar Mr.Feng
 * @date 2019/11/21 - 19:00
 */
@Configuration
@ComponentScan("com.work")
public class Spring_Configuration {
    @Scope("prototype")
    @Bean("user")
    public User getUser(){
        User user = new User();
        user.setName("鳳眸");
        user.setAge(19);
        return user;
    }
}
