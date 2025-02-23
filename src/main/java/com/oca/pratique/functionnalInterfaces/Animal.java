package com.oca.pratique.functionnalInterfaces;

import lombok.Builder;

@FunctionalInterface
public interface Animal {

    public void absractMethodForFunctionnalInterface();

    default String helloMethod(){


        return "hello";
    }

}
