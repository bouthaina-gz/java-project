package com.oca.pratique.collections;


import java.util.*;

public class ListCollection {

    public static void main(String[] args){

        List<String> myList = new ArrayList<>();

        Set<String> myTreeSet = new TreeSet<>();

        myList.add("element 1");
        myList.add("element 3");
        myList.add("element 4");
        myList.add("element 5");

        System.out.println(myTreeSet.add("element 1"));
        System.out.println(myTreeSet.add("element 3"));
        System.out.println(myTreeSet.add("element 4"));
        System.out.println(myTreeSet.add("element 5"));

        String[] myArrayt = {"hello 1"};

        //list with fixed size
        List<String> myList1 = Arrays.asList(myArrayt);

        List<String> myList1Copy = new ArrayList<>(myList1);


        //quant je change la list l'array se change aussi
        myList1.set(0,"hello 2");
        myList1Copy.set(0,"hello 3");

        //immutable list
        List<String> myList2 = List.of(myArrayt);

        //copy of a list
        List<String> myList3 =List.copyOf(myList1) ;

        myArrayt[0] = "imen";

        myList1.set(0,"bouthaina");

        //myList2.set(0 , "hola"); dosn't compile


        System.out.println(myList1);
        System.out.println(myList1Copy);
        System.out.println(myList1);
        System.out.println(myList);
        System.out.println(myTreeSet);

        /*System.out.println(myList2);
        System.out.println(myList3);
        System.out.println(Arrays.toString(myArrayt));*/
    }

}
