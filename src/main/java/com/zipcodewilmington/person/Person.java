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
         String name = getName();
         int age = getAge();
         Double weigth = getWeigth();
          String eyeColor = getEyeColor();
          String hairColor = getHairColor();

    }

    public Person(int age) {
        getAge();

    }

    public Person(String name) {
        getName();
    }

    public Person(Double weigth) {
        getWeigth();
    }

    public Person(String eyeColor) {
        getEyeColor();
    }

    public Person(String "hairColor") {
        getHairColor();
    }

    public Person(String name, int age, Double weigth, String eyeColor, String hairColor;) {
    }

    public void setName(String name) {
    }

    public void setAge(int age) {
    }

    public void setWeigth(Double weigth) {

    }

    public void setEyeColor(String eyeColor) {

    }

    public void setHairColor(String hairColor) {

    }

    public String getName() {
        return null;
    }

    public Integer getAge() {
        return null;
    }

    public Double getWeigth() {
        return null;
    }

    public String getEyeColor() {
        return null;
    }

    public String getHairColor() {
        return null;
    }

}



