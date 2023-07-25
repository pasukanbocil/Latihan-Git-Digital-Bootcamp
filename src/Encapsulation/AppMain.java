package Encapsulation;

import Encapsulation.parents.Person;

public class AppMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Meli Amelia Putri");
        person.setAddress("Garut");

        System.out.println(person.getName());
        System.out.println(person.getAddress());
    }
}
