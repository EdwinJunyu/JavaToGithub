package com.test;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    String name;
    int age;

    @Override
    public String toString(){
        return "我是" + name + "今年" + age + "岁！";
    }
}
