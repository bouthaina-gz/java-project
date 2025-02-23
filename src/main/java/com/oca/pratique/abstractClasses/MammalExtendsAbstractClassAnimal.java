package com.oca.pratique.abstractClasses;

abstract class MammalExtendsAbstractClassAnimal extends AbstractClasseAnimal {

    MammalExtendsAbstractClassAnimal(String name) {
        super(name);
    }

    public static final int age = 30;

    abstract void abstractMethodInMammalClass();
}
