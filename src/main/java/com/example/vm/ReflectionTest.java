package com.example.vm;

import javafx.scene.control.ComboBox;
import sun.misc.Unsafe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

public class ReflectionTest {


    public static void main(String[] args) throws Exception{

        Class c2 = Class.forName("sun.misc.Unsafe");
        System.out.println(Unsafe.class.hashCode());
        Field theUnsafe = c2.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        Unsafe unsafe2 = (Unsafe)theUnsafe.get(null);
        Constructor conUnsafe = c2.getDeclaredConstructor(null);
        conUnsafe.setAccessible(true);
        Unsafe unsafe = (Unsafe) conUnsafe.newInstance(null);
        AtomicInteger aa = new AtomicInteger(1);
        long valueOffset = unsafe.objectFieldOffset
                (AtomicInteger.class.getDeclaredField("value"));
        unsafe.compareAndSwapInt(aa, valueOffset, 1, 2);
        System.out.println(valueOffset);
        System.out.println(aa);

        Method method = Unsafe.class.getDeclaredMethod("compareAndSwapInt", Object.class, long.class, int.class, int.class);
        method.invoke(unsafe, aa, valueOffset, 2, 4);
        System.out.println(aa);

    }

}
