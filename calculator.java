package javaPractice;

import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first = sc.nextInt();
        System.out.println("Enter First Number");
        int second = sc.nextInt();
        System.out.println("Enter operation to perform (+,-,*,/,%)");
        char ch = sc.next().charAt(0);
        sc.close();
        switch (ch) {
            case '+':
                System.out.println(first + second);
                break;
            case '-':
                System.out.println(first - second);
                break;
            case '*':
                System.out.println(first * second);
                break;
            case '/':
                System.out.println(first / second);
                break;
            case '%':
                System.out.println(first % second);
                break;
            default:
                System.out.println("Please provide valid operator");
                break;
        }
    }
}