package com.oca.pratique.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class NextPermutation {

    public void nextPermutation(int[] nums) {

        List<Integer> list = new ArrayList<>();

        //if second one is the max going to the next
        List<Integer> listToAnArray =  Arrays.stream(nums).boxed().toList();

        int firstElement = nums[0];
        listToAnArray.remove(firstElement);

        int max = Collections.max(listToAnArray);
        //if second one is not the max still in the same iteration
        if(listToAnArray.get(0) != max){
            list.add(nums[0]);

        }else{
            list.add(Collections.min(listToAnArray));
            list.add(firstElement);
            listToAnArray.stream().sorted();
        }
        //if second one is the max ; iterate the first one and sort others
    }

    public static void main(String[] args){

    }
}
