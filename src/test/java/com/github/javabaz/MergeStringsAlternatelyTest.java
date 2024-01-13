package com.github.javabaz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MergeStringsAlternatelyTest {

    @Test
    void mergeAlternately1() {
        String word1 = "abc";
        String word2 = "pqr";

        String actual = MergeStringsAlternately.mergeAlternately(word1,word2);
        String expected = "apbqcr";

        assertEquals(expected, actual);
    }


    @Test
    void mergeAlternately2() {
        String word1 = "ab";
        String word2 = "pqrs";

        String actual = MergeStringsAlternately.mergeAlternately(word1,word2);
        String expected = "apbqrs";

        assertEquals(expected, actual);
    }


    @Test
    void mergeAlternately3() {
        String word1 = "abcd";
        String word2 = "pq";

        String actual = MergeStringsAlternately.mergeAlternately(word1,word2);
        String expected = "apbqcd";

        assertEquals(expected, actual);
    }
}