package javaPractice;

import java.util.Scanner;

public class functions{
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(isPrime(n) ? "The Number is Prime" : "The Number is not prime");


    }
}