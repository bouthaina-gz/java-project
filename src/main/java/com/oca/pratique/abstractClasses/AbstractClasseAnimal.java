package com.oca.pratique.abstractClasses;

abstract class AbstractClasseAnimal {

    AbstractClasseAnimal(String name){
        System.out.println("Hello " + name + " I am the constructor of abstract class");
    }

    public static void main(String[] args){}

    abstract void abstractMethod();

}
