package com.example.helloworld;

import java.util.Scanner;

public class Arrays {
    static String user_input(String commands) {
        Scanner In = new Scanner(System.in);
        System.out.println(commands);
        return In.nextLine();
    }
        public static void main(String[]args){
            String[] array = new String[0];
            String input = user_input("Array Commands:\nadd\nprint\nremove\ndone");
            switch (input){
                case "print":
                    for (int i = 0; i < array.length; i++){
                        System.out.println(array[i]);
                    }
                case "add":
                    String index = user_input("Input index");
                    int index_int = Integer.parseInt(index);
                    String value = user_input("Input value");
                    array[index_int] = value;
                case "done":
                    break;
            }
        }
}
