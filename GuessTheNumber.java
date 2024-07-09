import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){
        int num = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int guessNumber = Integer.MIN_VALUE;
        int count = 1;
        System.out.println("You have to guess the number, Lets see in how many moves you guess the right number. If you want to exit, type any negative number");
        while(true){
            System.out.println("Enter the Number");
            guessNumber = sc.nextInt();
            if(guessNumber==num){
                System.out.println("You guessed the number !! Wooohooooo, in " + count + " turns");
                break;
            }else if(guessNumber < 0){
                System.out.println("Thanks for playing");
                break;
            }
            else if(guessNumber > num){
                System.out.println("The number you guessed is higher.");
                count++;
            }else{
                System.out.println("The number you guessed is smaller.");
                count++;
            }
            System.out.println("----------------------");
        }
        sc.close();
    }
}
