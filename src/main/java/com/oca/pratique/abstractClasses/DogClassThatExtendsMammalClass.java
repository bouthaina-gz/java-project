package com.oca.pratique.abstractClasses;

public class DogClassThatExtendsMammalClass extends MammalExtendsAbstractClassAnimal{

      static String prenom = null;


    @Override
    void abstractMethod() {

    }

    @Override
    void abstractMethodInMammalClass() {

    }

    DogClassThatExtendsMammalClass(String name){
        super(name);
    }


    public static void main(String[] args){

        DogClassThatExtendsMammalClass dogClassThatExtendsMammalClass = new DogClassThatExtendsMammalClass("bouthaina");

        System.out.println("age is equal " + dogClassThatExtendsMammalClass.prenom);

        dogClassThatExtendsMammalClass.prenom = "ZINA";



        DogClassThatExtendsMammalClass dogClassThatExtendsMammalClass2 = new DogClassThatExtendsMammalClass("bouthaina");

        System.out.println("age is equal " + dogClassThatExtendsMammalClass2.prenom);


    }
}
