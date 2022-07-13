package com.example.helloworld;

import myfunctions.user_input;

public class Arrays {
        public static void main(String[]args){
            String[] array = new String[5];
            String input = "a", index = "";
            int index_int = 0;
            while (!input.equals("done")){
                input = user_input.userinput("Array Commands:\nadd\nprint\nremove\ndone");
                switch (input){
                    case "print":
                        for (int i = 0; i < array.length; i++){
                            System.out.println(array[i]);
                        }
                        break;
                    case "add":
                        index = user_input.userinput("Input index");
                        index_int = Integer.parseInt(index);
                        String value = user_input.userinput("Input value");
                        array[index_int] = value;
                        break;
                    case "remove":
                        index = user_input.userinput("Input index to remove");
                        index_int = Integer.parseInt(index);
                        array[index_int] = null;
                        break;
                    case "done":
                        break;
                }
            }
        }
}
