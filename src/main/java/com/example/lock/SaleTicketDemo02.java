package com.example.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicketDemo02  {
    public static void main(String[] args) {

        Ticket2 ticket = new Ticket2();
        new Thread(()->{for (int i = 1; i < 40 ; i++) ticket.sale();},"A").start();
        new Thread(()->{for (int i = 1; i < 40 ; i++) ticket.sale();},"B").start();
        new Thread(()->{for (int i = 1; i < 40 ; i++) ticket.sale();},"C").start();
    }
}
// Lock三部曲
// 1、 new ReentrantLock();
// 2、 lock.lock(); // 加锁
// 3、 finally=>  lock.unlock(); // 解锁
class Ticket2 {
    // 属性、方法
    private int number = 30;
    Lock lock = new ReentrantLock();

    public void sale(){
        lock.lock(); // 加锁

//        lock.tryLock();

        try {
//            System.out.println(Thread.holdsLock(lock));
            // 业务代码
            if (number>0){
                System.out.println(Thread.currentThread().getName()+"卖出了第" + number +"票,剩余：" + --number);
                sale2();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // 解锁
        }
    }

    public void sale2() {
        lock.lock();
        try {
            System.out.println("再次售票");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // 解锁
        }
    }

}