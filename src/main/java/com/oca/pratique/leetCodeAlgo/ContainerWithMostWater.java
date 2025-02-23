package com.oca.pratique.leetCodeAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        int maxArea = 0;
        int leftIndex= 0;
        int rightIndex = height.length-1;

        while(leftIndex < rightIndex){

            int currentArea = Math.min(height[leftIndex] , height[rightIndex]) * (rightIndex - leftIndex);

            maxArea = Math.max(currentArea , maxArea );

            if(height[leftIndex] > height[rightIndex]){
                rightIndex--;
            }else{
                leftIndex++;
            }
        }

        return maxArea;
    }

    public static void main(String[] args){

        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
