package com.example.vm;

import javafx.scene.control.ComboBox;
import sun.misc.Unsafe;

import java.lang.reflect.Constructor;

public class ClassLoaderTest {

    public static void main(String[] args) throws Exception {

        //当前类的类加载器以及其父加载器，父加载器的父加载器
        System.out.println(ClassLoaderTest.class.getClassLoader());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent().getParent());

        System.out.println(ComboBox.class.getClassLoader());
        System.out.println(String.class.getClassLoader()); //这里获得的类加载器为空，根加载器是


        Constructor cons = Unsafe.class.getDeclaredConstructor(null);
        cons.setAccessible(true);
        Unsafe unsafe = (Unsafe) cons.newInstance(null);

    }

}
