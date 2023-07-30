/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 5.1
 * File Name: Binary.java
 */

// Only accepts a Binary Input, and declines if it isn't

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String b = "";
        char ones = '1';
        int count = 0;
        
        while (b.equals("")){
            System.out.print("Enter Binary Number: ");
            b = sc.nextLine();
            if(!b.matches("[01]{1,}")){
                System.err.println("Invalid Binary Number! Try again...");
                b = "";
            } else {
                System.out.println("The binary number " + b + " is acceptable");
                for(int i = 0; i < b.length(); i++){
                    if (b.charAt(i) == ones){
                        count++;
                    }
                }
                System.out.print("There are " + count + " ones.");
            }
        }
        
    }
}
