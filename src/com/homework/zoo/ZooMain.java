package com.homework.zoo;

import com.homework.zoo.animals.Lion;
import com.homework.zoo.animals.exception.NegativeAgeException;
import com.homework.zoo.animals.exception.EmptyNameException;
import com.homework.zoo.animals.Pelican;

public class ZooMain {
    public static void main(String[] args) throws EmptyNameException, NegativeAgeException {
        Pelican pelican = new Pelican("Fredy",1);
        Lion lion = new Lion("Simba", 3);

        System.out.println(pelican.talk());
        System.out.println(lion.talk());
    }
}
