package edu.ti.caih313.recursion.simple;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntTenToTheN {

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        boolean fraction = false;
        if (number < 0) {
            number = -1 * number;
            fraction = true;
        }
        BigInteger tenToNum = tenToTheN(number);
        System.out.println("10^" + number + " =" + ((fraction)?" 1/":" ") + tenToNum);
        System.out.println(formatBigInteger(BigInteger.valueOf(700000000000l), ""));
    }

    static BigInteger tenToTheN(int n) {
        BigInteger val;
        if (n == 0) {
            val = BigInteger.ONE;
        } else if (n == 1) {
            val = BigInteger.TEN;
        } else {
            //BigInteger x = BigInteger.valueOf(8888888888888888855l) how to make a big number, (a long)
            BigInteger valHalf = tenToTheN(n/2);
            val = valHalf.multiply(valHalf);
            if (n%2 == 1) {
                val = val.multiply(BigInteger.TEN);
            }
        }
        return val;
    }

    static BigInteger ONE_THOUSAND = BigInteger.valueOf(1000);

    static String formatBigInteger(BigInteger n, String suffix){
        String formatedNum;
        if(n.compareTo(ONE_THOUSAND) < 0){ //-1= smaller, 0 == equal, 1= greater than
            formatedNum = n.toString() + suffix;
        }else{
            formatedNum = formatBigInteger(n.divide(ONE_THOUSAND), ",000"+suffix);
        }return formatedNum;
    }
}

