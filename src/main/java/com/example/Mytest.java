package com.example;

import java.util.Date;

public class Mytest {
    public static void main(String[] args) {
        Long begin = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {

        }
        Long end = System.currentTimeMillis();
        System.out.println((end - begin) / 1000);

    }
}
