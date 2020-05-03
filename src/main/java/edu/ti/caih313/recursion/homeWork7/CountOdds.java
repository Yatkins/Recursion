package edu.ti.caih313.recursion.homeWork7;

import java.util.Scanner;

public class CountOdds {
    private static int odds = 0;

    public static void main(String[] args) {
        System.out.println("Enter a non-negative number:");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println("Recursive Version: " + number + " contains " +
                countOdds(number) + " odds.");
        System.out.println("Non-recursive Version: " + number + " contains " +
                countOddsWhile(number) + " odds.");
    }

    private static int countOdds(int n) {
        if (n == 0) {
            return odds;
        } else if (n % 2 != 0) {
            odds++;
            countOdds(n / 10);
        } else {
            countOdds(n / 10);
        }
        return odds;
    }

    private static int countOddsWhile(int number) {
        int numDigits = 0;
        int n = number;
        int numOdds = 0;
        while(n > 0) {
            n = n / 10;
            numDigits++;
        }for(int i = 0; i < numDigits; i++){
            if(number % 2  != 0){
                 numOdds++;
            }number = number/10;
        }return numOdds;
    }
}