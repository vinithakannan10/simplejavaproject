import java.util.Scanner;

public class NumberFromUserIncreasingOrDecreasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number:");
        double num1 = in.nextInt();

        System.out.println("enter the second number:");
        double num2 = in.nextInt();

        System.out.println("enter the third number:");
        double num3 = in.nextInt();

        if(num1<num2 && num2<num3){
            System.out.println("The numbers are increasing order:");
        }
        else if(num1>num2 && num2>num3){
            System.out.println("The numbers are decreasing order:");
        }
        else{
            System.out.println("Neither the number is increasing or decreasing:");
        }
    }
}




