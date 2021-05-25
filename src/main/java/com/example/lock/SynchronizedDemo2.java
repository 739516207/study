package com.example.lock;

public class SynchronizedDemo2 {

    public static synchronized void staticMethod() throws InterruptedException {
        System.out.println("静态同步方法开始");
        Thread.sleep(1000);
        System.out.println("静态同步方法结束");
    }
    public synchronized void method() throws InterruptedException {
        System.out.println("实例同步方法开始");
        Thread.sleep(1000);
        System.out.println("实例同步方法结束");
    }
    public synchronized void method2() throws InterruptedException {
        System.out.println("实例同步方法2开始");
        Thread.sleep(3000);
        System.out.println("实例同步方法2结束");
    }
    public static void main(String[] args) {
        final SynchronizedDemo2 synDemo = new SynchronizedDemo2();
        new Thread(()->{
            try {
                synDemo.method();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();
        new Thread(() -> {
            try {
                synDemo.method2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "B").start();
    }

}
