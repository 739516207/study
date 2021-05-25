package com.example.vm;

public class Student {

    private String name;

    private int age;

    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + phone;
    }

    public String hello() {
        return "Hello";
    }

    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        Class stuClass = student.getClass();
        Class stuClass1 = student1.getClass();
        Class stuClass2 = student2.getClass();

        System.out.println(stuClass.hashCode());
        System.out.println(stuClass1.hashCode());
        System.out.println(stuClass2.hashCode());

        System.out.println(stuClass.getClassLoader());
        System.out.println(stuClass.getClassLoader().getParent());
        System.out.println(stuClass.getClassLoader().getParent().getParent());


    }
}
