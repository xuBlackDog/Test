package com.work.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @authar Mr.Feng
 * @date 2019/11/21 - 19:02
 */
@Data
@ToString
public class User {
    private String name;
    private Integer age;
}
