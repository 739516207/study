package com.example.vm;


import sun.misc.Launcher;

import java.net.URL;
import java.util.Arrays;

public class BootClassLoader {


    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        URL[] bootUrls = launcher.getBootstrapClassPath().getURLs();
        Arrays.stream(bootUrls).forEach(url -> {
            System.out.println(url.toExternalForm());
        });


//        URL[] extUrls = launcher.ExtClassLoader.getExtClassLoader();

    }
}
