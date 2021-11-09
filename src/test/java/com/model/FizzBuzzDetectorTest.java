package com.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzDetectorTest {

    private static FizzBuzzDetector fizzBuzz;

    @Before
    public void init() {
        fizzBuzz = new FizzBuzzDetector();
    }

    @Test
    public void getOverlappingsTest() {
        String expected = " ";
        assertEquals(expected, fizzBuzz.getOverlappings(" "));
        expected = "1 2 Fizz 4";
        assertEquals(expected, fizzBuzz.getOverlappings("1 2 3 4"));
        expected = "1, 2, Fizz 4, Buzz Fizz";
        assertEquals(expected, fizzBuzz.getOverlappings("1, 2, 3, 4, 5, 6"));
        expected = "Mary had Fizz little Buzz Fizz lamb, little Fizz Buzz had Fizz little lamb FizzBuzz fleece was Fizz as Buzz";
        assertEquals(expected, fizzBuzz.getOverlappings("Mary had a little lamb Little lamb, little lamb Mary had a little lamb It`s fleece was white as snow"));
        expected = "1 $ 3 4 % &";
        assertEquals(expected, fizzBuzz.getOverlappings("1 $ 3 4 % &"));
    }

    @Test
    public void toStringTest() {
        String expected = "output string:\nnull\ncount:0";
        fizzBuzz.getOverlappings("1 2 3");
        assertEquals(expected, fizzBuzz.toString());
        expected = "output string:\n1 2 Fizz 4\ncount:1";
        fizzBuzz.getOverlappings("1 2 3 4");
        assertEquals(expected, fizzBuzz.toString());
        expected = "output string:\nMary had Fizz little Buzz Fizz lamb, little Fizz Buzz had Fizz little lamb FizzBuzz fleece was Fizz as Buzz\ncount:9";
        fizzBuzz.getOverlappings("Mary had a little lamb Little lamb, little lamb Mary had a little lamb It`s fleece was white as snow");
        assertEquals(expected, fizzBuzz.toString());
    }
}
