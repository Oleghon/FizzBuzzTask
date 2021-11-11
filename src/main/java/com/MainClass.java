package com;

import com.model.FizzBuzzDetector;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        FizzBuzzDetector fizzBuzz = new FizzBuzzDetector();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter a text:");
        String str = scanner.nextLine();
        try{
            fizzBuzz.getOverlappings(str);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println(fizzBuzz);
    }
}
