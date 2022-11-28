import java.util.Scanner;

public class PrintTheGreatestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number:");
        int number1 = in.nextInt();

        System.out.println("enter the second number:");
        int number2 = in.nextInt();

        System.out.println("enter the third number:");
        int number3 = in.nextInt();

        if (number1 > number2)
            if (number1 > number3)
                System.out.println("The greatest number is:" + number1);


        if (number2 > number1)
            if (number2 > number3)
                System.out.println("The greatest number is:" + number2);


        if (number3 > number1)
            if (number3 > number2)
                System.out.println("The greatest number is:" + number3);
    }
}



