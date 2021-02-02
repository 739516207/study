package com.example.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Tom", 8900, 20,"male", "New York"));
        personList.add(new Person("Jack", 7000, 21,"male", "Washington"));
        personList.add(new Person("Lily", 7800, 18,"female", "Washington"));
        personList.add(new Person("Anni", 8200, 25,"female", "New York"));
        personList.add(new Person("Owen", 9500, 30,"male", "New York"));
        personList.add(new Person("Alisa", 7900, 21,"female", "New York"));

        List<String> fiterList1 = personList.stream().filter(x -> x.getSalary() > 8000).map(Person::getName).collect(Collectors.toList());
        System.out.println(fiterList1.toString());

        System.out.println(personList.stream().max(Comparator.comparing(Person::getAge)).get().getSalary());
    }
}
