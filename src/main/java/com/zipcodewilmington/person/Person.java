package com.zipcodewilmington.person;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private Double weigth;
    private String eyeColor;
    private String hairColor;


    public Person() {
         this.name = "";
         this.age = Integer.MAX_VALUE;

    }

    public Person(int age) {
        this.age = 5;

    }

    public Person( String name) {
        this.name = "Leon";
    }

    public Person(String name, int age){
        this.name = "Leon";
        this.age = 5;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeigth(Double weigth) {
        this.weigth = weigth;

    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;

    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;

    }

    public String getName() {

        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getWeigth() {
        return weigth;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

}



