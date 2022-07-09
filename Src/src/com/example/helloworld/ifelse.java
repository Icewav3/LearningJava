package com.example.helloworld;

public class ifelse {
    public static void main(String[]args){
        Double RNG = Math.random();
        if (RNG > 0.5) {
            System.out.println(RNG + " is larger than 0.5");
        }
        else {
            System.out.println(RNG + " is smaller than 0.5");
        }
    }
}
