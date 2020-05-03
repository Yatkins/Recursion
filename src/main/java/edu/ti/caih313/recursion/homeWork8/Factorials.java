package edu.ti.caih313.recursion.homeWork8;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args){
        boolean yes = true;
        while(yes) {
            System.out.println("Enter a number");
            System.out.println("I will calculate its factorial");
            Scanner keyboard = new Scanner(System.in);
            //int num = keyboard.nextInt();
            //long num = keyboard.nextInt();
            BigInteger num = BigInteger.valueOf(keyboard.nextInt());
            System.out.println(num + "! = " + factorial(num));
            System.out.println("if you want to continue, type yes");
            String answer = keyboard.next().toLowerCase();
            if(answer.equals("yes")){
                yes = true;
            }else{
                yes = false;
            }
        }
    }
    //the highest factorial int performed correctly using int is 12
    private static int factorial(int num){
          int factorial;
        if((num <= 1)){
            factorial = 1;
        }else{
            factorial = num * factorial(num-1);
        }
        return factorial;
    }

    //the highest factorial int performed correctly using long is 20
    private static long factorial(long num){
        long factorial;
        if((num == 0)||(num == 1)){
            factorial = 1;
        }else{
            factorial = num * factorial(num-1);
        }
        return factorial;
    }

    //Using BigInteger you can do as big factorials as you would like ()
    private static BigInteger factorial(BigInteger num){
        BigInteger factorial;
        if(num.compareTo(BigInteger.valueOf(2)) < 0){  //-1= smaller, 0 == equal, 1= greater than
            factorial = BigInteger.ONE;
        }else{
            factorial = num.multiply(factorial(num.subtract(BigInteger.ONE)));
        }
        return factorial;
    }
}
