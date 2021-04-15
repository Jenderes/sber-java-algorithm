package com.homework.zoo.animals;

import com.homework.zoo.animals.exception.EmptyNameException;
import com.homework.zoo.animals.exception.NegativeAgeException;

public class Pelican extends Animal {
    public Pelican(String name, int age) throws EmptyNameException, NegativeAgeException {
        super(name, age);
    }

    @Override
    public String talk() {
        return "pelican " + super.getName() + " talk";
    }

    @Override
    public boolean flightAble() {
        return true;
    }

    @Override
    public boolean moveAble() {
        return true;
    }

    @Override
    public boolean swimAble() {
        return true;
    }
}
