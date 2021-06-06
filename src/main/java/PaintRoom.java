/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;

public class PaintRoom {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int gallonRate = 350;

        System.out.print("What is the length of the ceiling? ");
        int length = input.nextInt();
        System.out.print("What is the width of the ceiling? ");
        int width = input.nextInt();

        int sFeet = length * width;

        int totalPaint = sFeet / gallonRate;
        int remainder = sFeet % gallonRate;

        if(remainder != 0){
            totalPaint++;
        }

        System.out.print("You will need to purchase " + totalPaint + " gallons of paint to cover " + sFeet + " square feet.");
    }
}

