package com.example.lock;

import java.util.concurrent.TimeUnit;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone1 = new Phone();

        //锁的存在
        new Thread(()->{
            phone.sendSms();
        },"A").start();

        // 捕获
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone.hello();
        },"B").start();
    }
}

class Phone{

    public synchronized void sendSms(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");
        call();
    }

    public synchronized void call(){
        System.out.println("打电话");
    }

    public void hello(){
        synchronized (this){
            String hello = "world";
            String world = "hello";
            System.out.println(hello + world);
        }
    }

}
