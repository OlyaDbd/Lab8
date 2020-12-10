package com.bsu;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new File("email.txt"))){
            while (scanner.hasNextLine()) {
                String msg = scanner.nextLine();
                if (checkEmail(msg)) {
                    System.out.println("Right email: " + msg);
                } else {
                    System.out.println("Wrong email: " + msg);
                }
            }
        }catch (Exception ex){
            System.out.println(new Exception());
        }
    }
    static boolean checkEmail(String line){
        return line.matches("^\\w[\\w-\\.]*@[\\w]+\\.[\\w]{2,4}");
    }
}
