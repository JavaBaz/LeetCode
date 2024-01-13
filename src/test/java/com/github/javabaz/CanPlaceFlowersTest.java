package com.github.javabaz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    void canPlaceFlowers1() {
        int[] flowerbed  = {1,0,0,0,1};
        int n = 1;

        boolean actual = CanPlaceFlowers.canPlaceFlowers(flowerbed,n);
        boolean expected = true;

        assertEquals(expected, actual);
    }


    @Test
    void canPlaceFlowers2() {
        int[] flowerbed  = {1,0,0,0,1};
        int n = 2;

        boolean actual = CanPlaceFlowers.canPlaceFlowers(flowerbed,n);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void canPlaceFlowers3() {
        int[] flowerbed  = {1,0,0,0,0,1};
        int n = 2;

        boolean actual = CanPlaceFlowers.canPlaceFlowers(flowerbed,n);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void canPlaceFlowers4() {
        int[] flowerbed  = {1,0,1,0,1,0,1};
        int n = 0;

        boolean actual = CanPlaceFlowers.canPlaceFlowers(flowerbed,n);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void canPlaceFlowers5() {
        int[] flowerbed  = {0,0,1,0,1};
        int n = 1;

        boolean actual = CanPlaceFlowers.canPlaceFlowers(flowerbed,n);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void canPlaceFlowers6() {
        int[] flowerbed  = {0};
        int n = 1;

        boolean actual = CanPlaceFlowers.canPlaceFlowers(flowerbed,n);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void canPlaceFlowers7() {
        int[] flowerbed  = {0,0,1,0,0};
        int n = 1;

        boolean actual = CanPlaceFlowers.canPlaceFlowers(flowerbed,n);
        boolean expected = true;

        assertEquals(expected, actual);
    }

}