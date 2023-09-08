package workbooks;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    int user_number = 0;
    Random rand = new Random();
    final int guess_number = rand.nextInt(10);

    public GuessNumber(){
        getNumber();

        if (user_number == guess_number) {
            System.out.println("You got it! Both numbers are " + guess_number);
        }
        else {
            System.out.println("You have missed! Your number is " + user_number
                    + " but you should choose " + guess_number);
        }
    }

    public void getNumber(){
        Scanner value = new Scanner(System.in);
        if (user_number == 0) {
            System.out.println("What is your int number between 0 to 10");
        }
        else {
            System.out.println("Try again. What is your int number between 0 to 10");
        }
        user_number = value.nextInt();
        System.out.println("You have " + user_number);
    }

}
