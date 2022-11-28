import java.util.Scanner;

public class DisplayMultiplicationTableOfGivenNumber {
    public static void main(String[] args) {
        int i,number;
        number = 100;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of terms:");
        number = in.nextInt();

       // System.out.println("i");
        for(i = 0;i<=number;i++){
            System.out.println(number+" x "+i+" = "+number*i);
        }
    }
}
