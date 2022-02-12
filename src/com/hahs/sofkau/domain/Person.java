package com.hahs.sofkau.domain;

import java.util.Random;

// Ejerccio 16
public class Person {
    private String name;
    private int age;
    private String DNI;
    private Character gender = 'M';
    private double weight;
    private double height;

    public static final int RIGHT_WEIGHT = -1;
    public static final int LOW_WEIGHT = 0;
    public static final int HIGHT_WEIGHT = 1;
    Random random = new Random();

    public Person() {
        this.generateDNI();
    }

    public Person(String name, int age, Character gender) {
        this.name = name;
        this.age = age;
        this.generateDNI();
        this.checkGender(gender);
    }

    public Person(
            String name,
            int age,
            Character gender,
            double weight,
            double height
    ) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.generateDNI();
        this.checkGender(gender);
    }


    /**
     * Calcula el IMC(indice de masa corporal) de una persona de acuerdo a la formula
     * (peso en kg/(altura ^2  en m))
     * @return
     */
    public int calculateIMC() {
        var weightRange = (int)this.weight / (Math.pow(this.height,2));
        return  calculateRangesOfWeight(weightRange);
    }

    /**
     * Retorna de acuerdo al IMC  (0, -1, 1).Si una persona esta en su peso ideal retorna (-1)
     * ,si esta por debajo(0) y si tiene sobrepeso retorna 1
     * @param weightRange rango
     * @return 0 | 1 | -1
     */
    // FIXME: 11/02/22 Los rangos suministrados en el ejercicio pueden no suministrar información del todo correcta 
    private int calculateRangesOfWeight(double weightRange) {
        if(weightRange < 20) {
            return  RIGHT_WEIGHT;
        } else if(weightRange >= 20 && weightRange <= 25) {
            return LOW_WEIGHT;
        } else {
            return  HIGHT_WEIGHT;
        }
    }


    /**
     * Calcula si una persona es mayor o menor de edad
     * @return true | false
     */
    public boolean isAdult() {
        return  this.age >= 18;
    }


    /**
     * Comprueba si el genre de una persona (instancia) contiene los caracteres validos
     * "M" | "F". Por defecto asigna "M" al genre de la persona
     * @param gender 'M' | 'F'
     */
    public void checkGender(char gender) {
        if( gender == 'F') {
            this.gender = 'F';
        } else if(gender == 'M') {
            this.gender = 'M';
        } else {
            this.gender = 'M';
        }
    }

    
    /**
     * Genera un DNI aleatorio de 8 characteres y lo asigna a la propiedad DNI de la persona (instancia)
     */
    public void generateDNI() {
        String dni = "";
        int[] randomNumbers = generateNumbers(8,0,7);
        for (int i = 0; i < randomNumbers.length; i++) {
            dni += characterController(randomNumbers[i]);
        }
        this.DNI = dni;
    }

    /**
     * Genera un array de numeros aleatorios
     * @param size El tamaño deseado de numeros a generar
     * @param initial valor de origin
     * @param bound limite
     * @return Array de numeros
     */
    private int[] generateNumbers(int size, int initial, int bound) {
        return random.ints(size, initial, bound).toArray();
    }

    /**
     * Genera un character de acuerdo a un numero(int) que recibe como parametro
     * @param randomNumber
     * @return
     */
    private String characterController(int randomNumber) {
        String [] character = { "A", "B", "C", "D", "E", "F", "X", "L"};
        return character[randomNumber];
    }

    /**
     * Muestra por consola un mensage que indica si una persona esta en su peso ideal,
     * por debajo o tiene sobrepso
     * @param person
     */
    public void getWeigthMessage(Person person) {
        if( person.calculateIMC() == -1) {
            System.out.println( person.getName()+ " Tienes un peso ideal" );
        } else if( person.calculateIMC() == 0) {
            System.out.println(person.getName() + " Estas por debajo de tu peso ideal");
        } else {
            System.out.println(person.getName() + " Tienes sobrepeso");
        }
    }

    /**
     * Muestra por consola si una persona(instancia) es mayor o menor de edad
     * @param isAdult
     * @param person
     */
    public void printIsAdultMessage(boolean isAdult, Person person) {
        if(isAdult) {
            System.out.println(person.getName() + " es mayor de edad");
        } else {
            System.out.println(person.getName() + " No es mayor de edad");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Character gender) {
        this.checkGender(gender);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDNI() {
        return DNI;
    }

    public Character getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DNI='" + DNI + '\'' +
                ", gender=" + gender +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
