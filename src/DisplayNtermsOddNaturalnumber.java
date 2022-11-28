import java.util.Scanner;

public class DisplayNtermsOddNaturalnumber {
    public static void main(String[] args) {
        int i,n,sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of terms:");
        n = in.nextInt();

        for(i = 1;i<=n;i++){
            System.out.println(2*i-1);
            sum+=2*i-1;
            System.out.println("sum values of terms "+n+" is:" +sum);
        }
    }
}
