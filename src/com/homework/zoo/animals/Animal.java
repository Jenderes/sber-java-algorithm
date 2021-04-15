package com.homework.zoo.animals;

import com.homework.zoo.animals.exception.EmptyNameException;
import com.homework.zoo.animals.exception.NegativeAgeException;

abstract class Animal implements MoveAble, SwimAble, FlightAble {
    private String name;
    private long age;
    private String color;

    abstract String talk();

    public Animal(String name, long age, String color) throws EmptyNameException, NegativeAgeException {
        if (name.equals("")){
            throw new EmptyNameException("Пустое имя не доступно");
        }
        if (age < 0) {
            throw new NegativeAgeException("Недопустимый возраст");
        }
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public Animal(String name, int age) throws EmptyNameException, NegativeAgeException {
        if (name.equals("")){
            throw new EmptyNameException("Пустое имя не доступно");
        }
        if (age < 0) {
            throw new NegativeAgeException("Недопустимый возраст");
        }
        this.name = name;
        this.age = age;
        this.color = "none";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws EmptyNameException {
        if (name.equals("")){
            throw new EmptyNameException("Пустое имя не доступно");
        }
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Недопустимый возраст");
        }
        this.age = age;
    }

    public void  setAge(String age) throws NegativeAgeException {
        if (Long.parseLong(age) < 0) {
            throw new NegativeAgeException("Недопустимый возраст");
        }
        this.age = Long.parseLong(age);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
