package com.github.javabaz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KidsWiththeGreatestNumberofCandiesTest {

    @Test
    void kidsWithCandies1() {
        int[] candies =  {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> expected = Arrays.asList(true,true,true,false,true);

        List<Boolean> actual = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(expected, actual);
    }

    @Test
    void kidsWithCandies2() {
        int[] candies =  {4,2,1,1,2};
        int extraCandies = 1;

        List<Boolean> expected = Arrays.asList(true,false,false,false,false);

        List<Boolean> actual = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(expected, actual);
    }

    @Test
    void kidsWithCandies3() {
        int[] candies =  {12,1,12};
        int extraCandies = 10;
        List<Boolean> expected = Arrays.asList(true,false,true);


        List<Boolean> actual = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(expected, actual);
    }


}