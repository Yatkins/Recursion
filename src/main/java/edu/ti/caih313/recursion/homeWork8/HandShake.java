package edu.ti.caih313.recursion.homeWork8;

import java.util.Scanner;

public class HandShake {

    public static void main(String[] args){
        System.out.println("Tell me how many people are in the room");
        System.out.println("I will tell you how many hand shakes there will be");
        Scanner keyboard = new Scanner(System.in);
        int totalPpl = keyboard.nextInt();
        System.out.println("There will be " + shakeHands(totalPpl) + " hand shakes!");
    }

    public static int shakeHands(int n){
        int totalShakes;
        if(n <= 1){
            totalShakes = 0;
        }else if(n == 2){
            totalShakes = 1;
        }else{
            totalShakes = (n-1) + shakeHands(n-1);
        }return totalShakes;
    }

}
