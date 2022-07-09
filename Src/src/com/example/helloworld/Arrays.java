package com.example.helloworld;

import java.util.Scanner;

public class Arrays {
    static String user_input(String commands) {
        Scanner In = new Scanner(System.in);
        System.out.println(commands);
        return In.nextLine();
    }
        public static void main(String[]args){
            String[] array = new String[5];
            String input = "a", index = "";
            int index_int = 0;
            while (!input.equals("done")){
                input = user_input("Array Commands:\nadd\nprint\nremove\ndone");
                switch (input){
                    case "print":
                        for (int i = 0; i < array.length; i++){
                            System.out.println(array[i]);
                        }
                        break;
                    case "add":
                        index = user_input("Input index");
                        index_int = Integer.parseInt(index);
                        String value = user_input("Input value");
                        array[index_int] = value;
                        break;
                    case "remove":
                        index = user_input("Input index to remove");
                        index_int = Integer.parseInt(index);
                        array[index_int] = null;
                        break;
                    case "done":
                        break;
                }
            }
        }
}
