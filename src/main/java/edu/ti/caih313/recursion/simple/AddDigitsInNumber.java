package edu.ti.caih313.recursion.simple;

import java.util.Scanner;

//TODO
public class AddDigitsInNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number and I will give the sum of all the digits:");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println("The sum of those digits are");
        System.out.println("Recursive version: " + addDigits(number));
        System.out.println("Non-recursive version: " + addDigitsWhileLoop(number));
    }

    public static int addDigits(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + addDigits(number / 10);
        }
    }

    public static int addDigitsWhileLoop(int number){
        int total = 0;
        int numDigits = 0;
        int n = number;
        while(n > 0){
            n = n/10;
            numDigits++;
        }for(int i = 0; i < numDigits; i++){
            total = total + number%10;
            number = number/10;
        }
        return total;
    }
}