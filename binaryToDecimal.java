package javaPractice;

import java.util.Scanner;

public class binaryToDecimal{
    public static int convertDecimal(int number){
        int pow = 0;
        int decimal = 0;
        while(number>0){
            int temp = number % 10;
            decimal += temp * Math.pow(2, pow);
            number = number / 10;
            pow++;
        }
        return decimal;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number");
        int binary = sc.nextInt();
        System.out.println(convertDecimal(binary));
    }
}