import java.util.Scanner;

import java.util.Scanner;

public class FindSumAndAverage {
    public static void main(String[] args) {
        int i,number = 0,sum = 0;
        double average ;
        {
            System.out.println("enter any 5 numbers:");
        }
        for( i =0;i<5;i++) {
            Scanner in = new Scanner(System.in);
            number = in.nextInt();
            sum += number;
        }
        average = sum/5;
        System.out.println("The sum of 5 number is:"+sum);
        System.out.println("The average of 5 number is:"+average);
    }
}

