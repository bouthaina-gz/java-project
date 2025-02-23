package com.oca.pratique.streams;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    static Stream<String> names = Stream.of("ben", "jean" , "Goerge");
    static Optional<String> minInAStream = Stream.of("ben", "jean" , "Goerge").min((s1,s2) -> s1.length() - s2.length());

    public static void main(String[] args){
        //minInAStream.ifPresent(System.out::println);

        //names.findFirst().ifPresent(System.out::println);

       // String reducingNames = names.reduce("first element", String::concat);

        Stream<Integer> emptyStream = Stream.empty();

        Optional<Integer> reducingValues = emptyStream.reduce((a, b) -> a*b);


        Integer reducingValuesForStringLength = Stream.of("ben","jean").reduce(0, (a,b) -> a + b.length(),(a,b) -> a+b);

        StringBuilder myString = Stream.of("ben", "George")
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        (s,u) -> System.out.println(u));

        Stream<String> namesFiltreted = names.
                peek(a -> System.out.println(a)).
                filter(s -> s.equals("ben"));

        System.out.println(namesFiltreted);
        //names.forEach(s -> System.out.println(s));

        Queue<String> myQueue = new PriorityQueue<>();
        
    }
}
