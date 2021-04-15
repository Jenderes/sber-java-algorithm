package com.homework.zoo.animals;

import com.homework.zoo.animals.exception.EmptyNameException;
import com.homework.zoo.animals.exception.NegativeAgeException;

public class Lion extends Animal{
    public Lion(String name, int age, String color) throws EmptyNameException, NegativeAgeException {
        super(name, age, color);
    }

    public Lion(String name, int age) throws EmptyNameException, NegativeAgeException {
        super(name, age);
    }

    @Override
    public String talk() {
        return "Lion " + super.getName() + " talk";
    }

    @Override
    public boolean flightAble() {
        return false;
    }

    @Override
    public boolean moveAble() {
        return true;
    }

    @Override
    public boolean swimAble() {
        return false;
    }
}
