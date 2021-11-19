package com.tommasomarchi.gettingusedwithgit;

import java.util.Scanner;

public class Helloworld {

    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }

}
