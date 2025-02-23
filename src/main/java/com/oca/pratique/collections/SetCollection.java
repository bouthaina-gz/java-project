package com.oca.pratique.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetCollection {

    public static void main(String[] args){

        Set<String> mySet = new HashSet<>();

        System.out.println(mySet.add("hello"));

        System.out.println(mySet.add("bouthaina"));

        System.out.println(mySet.add("imen"));

        System.out.println(mySet);
    }
}
