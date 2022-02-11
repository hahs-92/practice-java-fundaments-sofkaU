package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Person;

import java.util.Scanner;


public class TestPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //pedir datos
        System.out.println("Ingrese su nombre: ");
        String name = input.nextLine();
        System.out.println("Ingrese su edad: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese su Genero. M:Hombre F:Mujer: ");
        char genre = input.nextLine().charAt(0);
        System.out.println("Ingrese su peso(kg): ");
        double weight = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese su altura(metros): ");
        double height = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese su nombre: ");
        String name2 = input.nextLine();
        System.out.println("Ingrese su edad: ");
        int age2 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese su Genero. M:Hombre F:Mujer: ");
        char genre2 = input.nextLine().charAt(0);
        System.out.println("Ingrese su peso(kg): ");
        double weight2 = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese su altura(metros): ");
        double height2 = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese su nombre: ");
        String name3 = input.nextLine();
        System.out.println("Ingrese su edad: ");
        int age3 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese su Genero. M:Hombre F:Mujer: ");
        char genre3 = input.nextLine().charAt(0);
        System.out.println("Ingrese su peso(kg): ");
        double weight3 = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese su altura(metros): ");
        double height3 = Double.parseDouble(input.nextLine());

        //instancias
        Person person1 = new Person(name,age,genre,weight,height);

        Person person2 = new Person(name2,age2,genre2);
        person2.setWeight(weight2);
        person2.setHeight(height2);

        Person person3 = new Person();
        person3.setName(name3);
        person3.setAge(age3);
        person3.setGenre(genre3);
        person3.setWeight(weight3);
        person3.setHeight(height3);

       //imprimir si esta en peso ideal
        person1.getWeigthMessage(person1);
        person2.getWeigthMessage(person2);
        person3.getWeigthMessage(person3);

        //imprimir si es mayor de edad
        person1.printIsAdultMessage(person1.isAdult(), person1);
        person2.printIsAdultMessage(person2.isAdult(), person2);
        person3.printIsAdultMessage(person3.isAdult(), person3);

        //info de cada persona
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);


    }
}
