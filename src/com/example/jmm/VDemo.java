package com.example.jmm;


import java.util.concurrent.atomic.AtomicInteger;

public class VDemo {
    // volatile 不保证原子性
    private volatile static int num = 0;
    private static AtomicInteger aa = new AtomicInteger();
    public static void add(){
        num++;
        aa.getAndIncrement();
    }

    public static void main(String[] args) {
        //理论上num结果应该为 2 万
        for (int i = 1; i <= 20; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000 ; j++) {
                    add();
                }
            }).start();
        }
        while (Thread.activeCount()>2){ // main  gc
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + " num: " + num);
        System.out.println(aa);
    }
}
