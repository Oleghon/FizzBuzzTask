package com.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class FizzBuzzDetectorTest {

    private static FizzBuzzDetector fizzBuzz;

    @Before
    public void init() {
        fizzBuzz = new FizzBuzzDetector();
    }

    @Test
    public void shouldReturnExceptionWhenInputLengthLessThanSeven() {
        String expected = "Input should contain at least 7 or more alphanumeric characters and symbols \"` , ' . \" but not more than 100.";
        Exception exception = assertThrows(Exception.class, () -> fizzBuzz.getOverlappings(" "));
        assertEquals(expected, exception.getMessage());
    }

    @Test
    public void shouldReturnExceptionWhenInputHaveNotCorrectCharacters() {
        String expected = "Input should contain at least 7 or more alphanumeric characters and symbols \"` , ' . \" but not more than 100.";
        String actual = "1 $ 3 4 % &";
        Exception exception = assertThrows(RuntimeException.class, () -> fizzBuzz.getOverlappings(actual));
        assertEquals(expected, exception.getMessage());
    }

    @Test
    public void shouldReturnExceptionWhenInputLengthMoreThanAHundred() {
        String expected = "Input should contain at least 7 or more alphanumeric characters and symbols \"` , ' . \" but not more than 100.";
        String actual = "DMRBxk4FUDwPVCTLCHkSVKjLATVaGEh6jthFeETghG4WPZXLv5uehMXabpn85TnwCmeqUcjXLzt4TAAP99ZGAtuy39wDNCuDRrB9e";
        Exception exception = assertThrows(RuntimeException.class, () -> fizzBuzz.getOverlappings(actual));
        assertEquals(expected, exception.getMessage());
    }

    @Test
    public void shouldReplaceOneWord() {
        String expected = "1, 2, Fizz";
        String actual = "1, 2, 3";
        assertEquals(expected, fizzBuzz.getOverlappings(actual));
    }

    @Test
    public void shouldReplaceThreeWords() {
        String expected = "1, 2, Fizz 4' Buzz Fizz";
        String actual = "1, 2, 3, 4' 5` 6";
        assertEquals(expected, fizzBuzz.getOverlappings(actual));
    }

    @Test
    public void shouldReplaceNineWords() {
        String expected = "Mary had Fizz little Buzz Fizz lamb, little Fizz Buzz had Fizz little lamb FizzBuzz fleece was Fizz as Buzz";
        String actual = "Mary had a little lamb Little lamb, little lamb Mary had a little lamb It`s fleece was white as snow";
        assertEquals(expected, fizzBuzz.getOverlappings(actual));
    }

    @Test
    public void shouldReturnStringWithCountOne() {
        String expected = "output string:\n1 2 Fizz 4\ncount:1";
        fizzBuzz.getOverlappings("1 2 3 4");
        assertEquals(expected, fizzBuzz.toString());
    }

    @Test
    public void shouldReturnStringWithCountNine() {
        String expected = "output string:\nMary had Fizz little Buzz Fizz lamb, little Fizz Buzz had Fizz little lamb FizzBuzz fleece was Fizz as Buzz\ncount:9";
        fizzBuzz.getOverlappings("Mary had a little lamb Little lamb, little lamb Mary had a little lamb It`s fleece was white as snow");
        assertEquals(expected, fizzBuzz.toString());

    }
}
