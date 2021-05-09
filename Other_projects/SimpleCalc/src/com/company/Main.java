package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// A SImple calculator to carry out division
        var sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        var n1 = sc.nextDouble();
        System.out.print("Enter the second number :");
        var n2 = sc.nextDouble();
        double n3 =n1/n2;
        System.out.print("The result is : "+ n3);

    }
}
