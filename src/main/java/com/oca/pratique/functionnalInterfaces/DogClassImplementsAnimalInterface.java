package com.oca.pratique.functionnalInterfaces;

public class DogClassImplementsAnimalInterface {

    public static void main(String[] args){

        String variable = String.valueOf(1);

        Animal animal2 = () -> {
            Math.min(5,3);
            System.out.println("this is the implementation of an interface 2");};
        animal2.absractMethodForFunctionnalInterface();
    }



}
