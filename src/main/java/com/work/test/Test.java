package com.work.test;

import com.config.Spring_Configuration;
import com.work.bean.Manager;
import com.work.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @authar Mr.Feng
 * @date 2019/11/21 - 19:07
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext act = new AnnotationConfigApplicationContext(Spring_Configuration.class);
//        User user = act.getBean("user",User.class);
//        User user1 = act.getBean("user",User.class);
//        System.out.println(user);
//        System.out.println(user1);
//        System.out.println(user1==user);
        Manager man =  act.getBean("manager",Manager.class);
        System.out.println(man);
    }
}
