package com.example.helloworld;

import java.util.Scanner;

import myfunctions.user_input;

public class counter {
    static String user_input(String commands) {
        Scanner In = new Scanner(System.in);
        System.out.println(commands);
        return In.nextLine();
    }
        String input = "", index = "";
        int index_int = 0;
            public static void main(String[]args){
               String input = user_input.userinput("What Number should I count to?");
                int index_int = Integer.parseInt(input);
                int max = 1 + index_int;
                for (int i = 0; i < max; i++) {
                    System.out.println(i);
                }
            }
}
