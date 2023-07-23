package com.example;

import java.util.Scanner;

/**
 * Launcher
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Hello World..... type stop to exit....");
        Scanner scanner = new Scanner(System.in);
        String read = "";
        while (!(read = scanner.next()).equalsIgnoreCase("stop"))
            System.out.println("Your input:"+read);
        System.out.println("Good Bye!!");
    }
}
