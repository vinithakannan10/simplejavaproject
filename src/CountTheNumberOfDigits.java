import java.util.Scanner;

public class CountTheNumberOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number:");
        long number = in.nextLong();
        if (number < 0) {
            number *= -1;
        }
        {
            int digits = 1;
            if (number >= 10 && number < 100)
            {
                digits = 2;
            } else if (number >= 100 && number < 1000)
            {
                digits = 3;
            } else if (number >= 1000 && number < 10000)
            {
                digits = 4;
            } else if (number >= 10000 && number < 100000)
            {
                digits = 5;
            } else if (number >= 100000 && number < 1000000)
            {
                digits = 6;
            }
            System.out.println("enter the number of digits in this number:" + digits);
        }
        }
         {
            System.out.println("this number is not an integer ");
        }
    }



