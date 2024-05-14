package javaPractice;
import java.util.*;
import java.util.Scanner;

public class stringCompress{
    public static String compress(String s){
        StringBuilder sh = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            int count = 0;
            sh.append(s.charAt(i));
            while(i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                sh.append(count);
            }
        }
        return sh.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name");
        String name = sc.nextLine();
        System.out.println(compress(name));
    }
}