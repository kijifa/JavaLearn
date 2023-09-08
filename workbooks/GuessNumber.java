package workbooks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    int user_number = 0;
    boolean done = false;
    List<Integer> history = new ArrayList();

    Random rand = new Random();
    final int guess_number = rand.nextInt(10);

    public GuessNumber(){
        while (!done) {
            getNumber();
            compare();
        }

    }

    public void getNumber(){
        Scanner value = new Scanner(System.in);
        if (user_number == 0) {
            System.out.println("What is your int number between 0 to 10");
        }
        else {
            System.out.println("Try again. What is your int number between 1 to 10");
        }
        user_number = value.nextInt();
        System.out.println("You have " + user_number);
    }

    public void compare(){
        if (0 < user_number & user_number < 11) {
            if (user_number == guess_number) {
                System.out.println("You got it! Both numbers are " + guess_number);
                System.out.println("You needed " + history.size());
                done = true;
            } else {
                history.add(user_number);
                System.out.println("You have missed! You already tried " + history);
            }
        } else {
            System.out.println("Your number " + user_number + " is not between 1 and 10");
        }
    }

}
