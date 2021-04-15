package com.homework.zoo.animals;

import com.homework.zoo.animals.Animal;
import com.homework.zoo.animals.exception.EmptyNameException;
import com.homework.zoo.animals.exception.NegativeAgeException;

public class Seal extends Animal {
    public Seal(String name, long age, String color) throws EmptyNameException, NegativeAgeException {
        super(name, age, color);
    }

    public Seal(String name, int age) throws EmptyNameException, NegativeAgeException {
        super(name, age);
    }

    @Override
    public String talk() {
        return "Seal " + super.getName() + " talk";
    }

    @Override
    public boolean flightAble() {
        return false;
    }

    @Override
    public boolean moveAble() {
        return false;
    }

    @Override
    public boolean swimAble() {
        return true;
    }
}
