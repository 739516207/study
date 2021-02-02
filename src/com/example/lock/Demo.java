package com.example.lock;

public class Demo {
    public static void main(String[] args) {
        int c = 10;
        Model modelA = new Model(2);
        Model modelB = new Model(3);
    }
}

class Model
{
    public static int a = 1;
    public int b;

    public Model(int b) {
        this.b = b;
    }
}
