package com.example.concurrent;

public class AddDataTest {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            new MyThread().start();
        }
    }
}