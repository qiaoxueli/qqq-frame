package com.example.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result<T> {
    private String code;
    private T data;


    public static void main(String[] args) {
        int i = 1+1;
        int a = 10 * i;
        System.out.println("输出a:" + a);
    }
}
