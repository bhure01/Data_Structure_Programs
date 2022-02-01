package com.bridgelabz.datastructure;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String string = sc.next();
        DequeueUtility<Character> utility=new DequeueUtility<Character>();

        //adding each character to the rear of the deque
        for(int i=0;i<string.length();i++) {
            char character =string.charAt(i);
            utility.addRear(character);
        }
        int flag = 0;

        while(utility.size()>1) {
            if(utility.removeFront()!=utility.removeRear()) {
                flag=1;
                break;
            }
        }

        if(flag == 0) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }
    }
}
