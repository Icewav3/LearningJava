package com.example.helloworld;
import java.util.Scanner;

public class gamble {
    public static void main(String[]args){
        Scanner IN = new Scanner(System.in);
        System.out.println("Select a mode:\n1: Roll once\n2: Roll until you get a value");
        int input = IN.nextInt();
        switch (input) {
            case 1: {
                double RNG = Math.random();
                if (RNG > 0.5) {
                    System.out.println(RNG + " is larger than 0.5");
                } else {
                    System.out.println(RNG + " is smaller than 0.5");
                }
                break;
            }
            case 2: {
                int Rolls = 0;
                double RNG = 0.0;
                while (RNG < 0.99) {
                    RNG = Math.random();
                    ++Rolls;
                }
                System.out.println("It took us: " + Rolls + " to get a value greater than 0.99");
            }
        }
    }
}
