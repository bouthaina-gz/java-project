package com.oca.pratique.optional;

import java.util.Optional;

public class OptionalInAction {

    public static Optional<Integer> calculateAverage(Integer age){

       return Optional.ofNullable(age);
    }

    public static void main(String[] args){

         Optional<Integer> myOptionnal1 = calculateAverage(null);

         if(myOptionnal1.isPresent()){
             System.out.println("optional 1 is present");
         }


        Optional<Integer> myOptionnal2 = calculateAverage(30);

       myOptionnal2.ifPresent(System.out::println);

    }
}
