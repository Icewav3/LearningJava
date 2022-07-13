package myfunctions;

import java.util.Scanner;

public class user_input {
        public static String userinput(String commands) {
            Scanner In = new Scanner(System.in);
            System.out.println(commands);
            return In.nextLine();
        }
}
