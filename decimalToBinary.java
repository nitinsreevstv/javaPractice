package javaPractice;

import java.util.Scanner;

public class decimalToBinary{
    public static int convertDecimal(int n){
        int bin = 0;
        int power = 0;
        while(n>0){
            int temp = n%2;
            bin += (temp * (int)Math.pow(10, power));
            power++;
            n = n/2;   
        }
        return bin;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to convert in Binary");
        int n = sc.nextInt();

        System.out.println(convertDecimal(n));
    }
}