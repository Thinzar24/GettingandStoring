package com.company;

import java.util.Scanner;

public class GettingandStoring {

    public static void main(String[] args) {
	// write your code here
        String name;
        Scanner keyboard = new Scanner(System.in);
        System.out.print(" Enter your name ");
        name = keyboard.nextLine();

        System.out.print(" Hello " + name);
        
    }
}
