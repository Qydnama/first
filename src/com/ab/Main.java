package com.ab;

import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<Person>();

        person.add(new Student("Erlan","Raisov",2.5));
        person.add(new Employee("Rayan","Gosling","Driver",370000));
        person.add(new Student("Aruzhan","Ospanova",2.9));
        person.add(new Employee("Nursultan","Khaimuldin","Teacher",500000));
        Collections.sort(person);
        printData(person);



    }
    public static void printData(Iterable<Person> person) {
        for(Person p: person)
            System.out.println(p.toString()+" earns "+p.getPaymentAmount()+" tenge");


    }
}