package com.oca.pratique.abstractClasses;

public class CatClassThatExtendsMammalClass extends MammalExtendsAbstractClassAnimal{

    public final int age = 40;
    @Override
    void abstractMethod() {

    }

    @Override
    void abstractMethodInMammalClass() {

    }

    CatClassThatExtendsMammalClass(String name){
        super(name);
    }


    public static void main(String[] args){

        CatClassThatExtendsMammalClass dogClassThatExtendsMammalClass = new CatClassThatExtendsMammalClass("bouthaina");

        System.out.println("age is equal " + dogClassThatExtendsMammalClass.age);

    }
}
