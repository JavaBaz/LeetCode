package com.github.javabaz;

public class CanPlaceFlowers {

    //605. Can Place Flowers
    //You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
    //Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int leftPointer = 0;
        int currentPointer = flowerbed[0];
        int count = 0;

        for (int rightPointer = 1; rightPointer < flowerbed.length; rightPointer++) {
            if (currentPointer == 0 && currentPointer == leftPointer && currentPointer == flowerbed[rightPointer]) {
                count++;
                leftPointer = 1;
            } else {
                leftPointer = currentPointer;
            }
            currentPointer = flowerbed[rightPointer];
        }
        if (leftPointer == 0 && leftPointer == currentPointer) {
            count++;
        }
        return count >= n;
    }
}