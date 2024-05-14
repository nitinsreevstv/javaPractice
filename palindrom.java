package javaPractice;

import java.util.Scanner;

public class palindrom{
    public static void palindrom(String s){
        int n = s.length();
        int flag = 0;
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                System.out.println(s + " is not palindrom");
                flag++;
                break;
            }
        }
        if(flag==0){
            System.out.println(s + " is Palindrom");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to check Palidrom");
        String name = sc.nextLine();
        palindrom(name);
    }
}