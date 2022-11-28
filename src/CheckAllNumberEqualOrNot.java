import java.util.Scanner;

public class CheckAllNumberEqualOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 = in.nextInt();

        System.out.println("enter the second number:");
        int num2 = in.nextInt();

        System.out.println("enter the third number:");
        int num3 = in.nextInt();

        if(num1==num2 && num1==num3){
            System.out.println("All numbers are equal");
        }
        else if((num1==num2||num1==num3||num2==num3)) {
            System.out.println("All numbers are equal or not:");
        }
        else{
            System.out.println("All numbers are not equal:");
        }
    }
}
