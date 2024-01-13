package com.github.javabaz;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {


    //There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

    //Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highestCandy = 0;

        List<Boolean> output = new ArrayList<>();

        for (int candy : candies) {
            if (candy > highestCandy) highestCandy = candy;
        }

        for (int candy : candies) {
            boolean result = candy + extraCandies >= highestCandy;
            output.add(result);
        }


        return output;
    }
}
