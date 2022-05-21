package com.sparta.week01.prac;

public class Person {
    private String name;
    private int age;
    private String address;
    private String petName;
    private int petAge;

    public Person() {

    }

    public Person(String name, int age, String address, String petName, int petAge) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.petName = petName;
        this.petAge = petAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPetName() {
        return this.petName;
    }

    public int getPetAge() {
        return this.petAge;
    }
}
