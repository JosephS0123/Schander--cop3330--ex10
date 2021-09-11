package org.example;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner uInput = new Scanner(System.in);
        System.out.println("Enter the price of item 1");
        double Item1P = uInput.nextDouble();
        System.out.println("Enter the quantity of item 1");
        int Item1Q = uInput.nextInt();
        System.out.println("Enter the price of item 2");
        double Item2P = uInput.nextDouble();
        System.out.println("Enter the quantity of item 2");
        int Item2Q = uInput.nextInt();
        System.out.println("Enter the price of item 3");
        double Item3P = uInput.nextDouble();
        System.out.println("Enter the quantity of item 3");
        int Item3Q = uInput.nextInt();
        double Subtotal = (Item1P*Item1Q)+(Item2P*Item2Q)+(Item3P*Item3Q);
        double Tax = (Subtotal * .055);
        System.out.println("Subtotal: " + Subtotal + "\nTax: " + Tax + "\n Total: "+(Subtotal+Tax));
    }
}
