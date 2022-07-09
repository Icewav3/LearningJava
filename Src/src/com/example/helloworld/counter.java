package com.example.helloworld;

import java.util.Scanner;

public class counter {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("What Number should I count to?");
        int max = 1 + input.nextInt();
        for (int i = 0; i < max; i++) {
            System.out.println(i);
        }
    }
}
