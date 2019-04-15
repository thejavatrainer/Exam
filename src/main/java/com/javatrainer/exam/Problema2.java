package com.javatrainer.exam;

public class Problema2 {

// This problem contains also class Person

    public static boolean checkNameContainsAna(Person persons[]) {
        for (Person aPerson : persons) {
            if (aPerson.name.contains("ana")) {
                return true;
            }
        }
        return false;
    }

    public static double averageAge(Person persons[]) {
        double sumAges = 0;
        for (Person aPerson : persons) {
            sumAges += aPerson.age;
        }
        System.out.println("Suma varstelor: " + sumAges);
        System.out.println("Numarul de elemente din array: " + persons.length);
        return sumAges / persons.length;
    }

    public static Person findTheYoungestPerson(Person persons[]) {
        String name = "";
        int age = 300;
        for (Person aPerson : persons) {
            if (aPerson.age < age) {
                name = aPerson.name;
                age = aPerson.age;
            }
        }
        return new Person(name, age);
    }

    public static boolean checkIfPersonIsMajor(Person persons[], String thePersonToBeChecked) {
        for (Person aPerson : persons) {
            if (aPerson.name.equals(thePersonToBeChecked) && (aPerson.age >= 18))
                return true;

        }
        return false;
    }

    public static void main(String args[]) {
        Person persons[] = new Person[]{new Person("Roxana", 10),
                new Person("Geta", 22),
                new Person("Diana", 15),
                new Person("Dana", 34),
                new Person("Ana", 55),
                new Person("Moana", 23),
                new Person("Viorica", 21),
                new Person("Maria", 4),
                new Person("Raluca", 5),
                new Person("Mirela", 9)};

        if (checkNameContainsAna(persons)) {
            System.out.println("b) The array contains ana");
        } else {
            System.out.println("b) The array doesn't contain ana");
        }

        System.out.println("c) The average of ages is: " + averageAge(persons));

        Person theYoungestPerson = findTheYoungestPerson(persons);
        System.out.println("d) The youngest person is: " + theYoungestPerson.name + " with age: " + theYoungestPerson.age);

        if (checkIfPersonIsMajor(persons, "Raluca")) {
            System.out.println("e) The person has is major");

        } else {
            System.out.println("e) The person is not major");
        }
    }
}
