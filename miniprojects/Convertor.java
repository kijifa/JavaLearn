package miniprojects;
import java.util.Scanner;

public class Convertor {

    public static void convert(){
        Scanner value = new Scanner(System.in);
        Double number;

        System.out.println("How many CZK you have");
        number = value.nextDouble();
        System.out.println("You have " + number);

        Object finale = toEuro(number);
        System.out.println("Virtually you have " + finale + " Euros. Congratulations!");
    }

    public static Object toEuro(Double value){
        Double ratio = 0.04;
        System.out.println("Choosen ratio is " + ratio + " Euro per 1 CZK");
        Double result = value * ratio;

        return result;

    }
}
