package edu.ti.caih313.recursion.simple;

import java.util.Scanner;

public class TenToTheN {

    public static void main(String[] args){
        System.out.println("Enter a digit and i will raise ten to that power");
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();
        System.out.println(tenToTheN(i));
        System.out.println(tenToTheNForLoop(i));
    }
    public static int tenToTheN(int n){
        int value;
            if(n == 0){
                value = 1;
            }else if (n ==1){
                value = 10;
            }else if (n == 2){
                value = 100;
            } else if(n % 2 == 0){
                int halfValue = tenToTheN(n/2);
                value = halfValue * halfValue;
            }else{
                int val = tenToTheN((n-1)/2);
                value = 10*val*val;
        }return value;
    }

    public static int tenToTheNForLoop(int n){
        int value = 1;
        for(int i = 0; i < n; i++){
            value = value * 10;
        }return value;
    }
}

