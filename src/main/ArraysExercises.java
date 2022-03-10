package main;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        Person [] people;
        people = new Person[3];
        people[0] = new Person("Bob");
        people[1] = new Person("Joe");
        people[2] = new Person("Sue");
        for (Person person : people) {
            System.out.println(person.getName());
        }

        Person Jack = new Person("Jack");
        Person [] morePeople;
        morePeople = addPerson(people, Jack);
        for (Person person : morePeople) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] oldArray, Person newPerson){
        Person[] newArray = new Person[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = newPerson;
        return newArray;
    }
}
