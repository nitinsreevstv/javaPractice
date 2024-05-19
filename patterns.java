package javaPractice;

import java.util.Scanner;

public class patterns{
    public static void pattern1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void space(int n){
        for(int i = 0; i < n; i++){
            System.out.println("----------------");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();

        pattern1(n);
        space(2);
        pattern2(n);
        space(2);
    }

}