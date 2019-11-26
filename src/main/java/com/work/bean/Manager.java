package com.work.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @authar Mr.Feng
 * @date 2019/11/22 - 20:29
 */
@Data
@ToString
@Component
public class Manager {
    private String name;
    private Integer age;
    private char sex;
}
