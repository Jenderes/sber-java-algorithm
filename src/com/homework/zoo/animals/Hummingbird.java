package com.homework.zoo.animals;

import com.homework.zoo.animals.exception.EmptyNameException;
import com.homework.zoo.animals.exception.NegativeAgeException;

public class Hummingbird extends Animal {
    public Hummingbird(String name, long age, String color) throws EmptyNameException, NegativeAgeException {
        super(name, age, color);
    }

    public Hummingbird(String name, int age) throws EmptyNameException, NegativeAgeException {
        super(name, age);
    }

    @Override
    public String talk() {
        return null;
    }

    @Override
    public boolean flightAble() {
        return true;
    }

    @Override
    public boolean moveAble() {
        return false;
    }

    @Override
    public boolean swimAble() {
        return false;
    }
}
