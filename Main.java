import challenges.MyInicials;
import workbooks.GuessNumber;

import static miniprojects.Convertor.convert;
import static workbooks.FirstProgram.firstProgram;

public class Main {
    public static void main(String[] args) {
        System.out.println("Based on Udemy course");
        System.out.println("Let the game begin");
        System.out.println("Workbook 1.1");
            firstProgram();
        System.out.println("Challenge 1 - write an inicials");
            MyInicials.main();
        //System.out.println("Currency convertor");
        //    convert();
        System.out.println("Guess a number game");
             new GuessNumber();
    }
}
