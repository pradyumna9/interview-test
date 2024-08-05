package com.mycomp.example.test;

import com.mycomp.model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamTest {
    public static void main(String[] args) {
        Person person = new Person("pkd", "123", 12.98f);
        Person person1 = new Person("bby", "321", 23.98f);
        Person person2 = new Person("bby", "321", 111f);
        Map<String,Person> personMap = new HashMap<>();
        personMap.put("1",person);
        personMap.put("2",person1);
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(person);
        personArrayList.add(person1);
        personArrayList.add(person2);
        List<Person> collect = personArrayList.stream().sorted().collect(Collectors.toList());
      //  Map<String, Float> stringFloatMap = personArrayList.stream().collect(Collectors.toMap(Person::getName, Person::getSalary));
       // stringFloatMap.entrySet().forEach(System.out::println);

        HashMap<String, Float> collect1 = personArrayList.stream().collect(Collectors.toMap(Person::getId, Person::getSalary, (o, n) -> n, HashMap::new));
        collect1.entrySet().forEach(System.out::println);

    }
}
