package com.example.concurrent;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {

    public static void main(String[] args) throws ClassNotFoundException {
        //并发下使用list
        //1.Vector<>
//        2.Collections.synchronizedList(new ArrayList<>())
        //3.CopyOnWriteArrayList<>()
//        List<String> cc = Collections.synchronizedList(new ArrayList<>());
//        List<String> aa = new CopyOnWriteArrayList<>();
//        for (int i = 0; i < 30; i++) {
//            new Thread(() -> {
//                String id = UUID.randomUUID().toString().substring(0, 6);
//                aa.add(id);
//                System.out.println("线程" + Thread.currentThread().getName() + "添加了" + id);
//                System.out.println(aa);
//
//            }, "线程：" + i).start();
//
//        }
        a();

    }

    public static void a() {
        b();
    }

    public static void b() {
        a();
    }

}
