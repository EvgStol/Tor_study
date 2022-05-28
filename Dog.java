package com.company;

public class Dog {
    String name;
    int weight;
    String gender;
    int age;
    String breed;

    public Dog (String name,  int weight) {
        this.name = name;
        this.weight = weight;

    }
    public Dog (String gender, int age, String name, int weight, String breed){
        this.gender = gender;
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.breed = breed;
    }
    public void grow (int weight) {
        System.out.println(weight);
    }
    void change (int age, String name, String breed) {
        System.out.println(age + " " + name + " " + breed);
    }
    void change (String name, String gender) {
        System.out.println(name + " " + gender);
    }
    public static void main(String[] args) {
    Dog haski = new Dog("kino", 30);
    Dog chihuahua = new Dog("BabyJon", 10);
    Dog lost = new Dog("male", 2,"Jo",7,"pudel");

    haski.grow(30);
    chihuahua.grow(10);
    lost.change(20,"Joi","buldog");
    lost.change("Saman", "female");

        System.out.println(haski.name + " " + haski.weight );
        System.out.println( chihuahua.name + " " + chihuahua.weight);
        System.out.println(lost.gender + " " + lost.age + " " + lost.name + " " + lost.weight + " " + lost.breed);


    }
}
