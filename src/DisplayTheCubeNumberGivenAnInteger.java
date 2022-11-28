import java.util.Scanner;

public class DisplayTheCubeNumberGivenAnInteger {
    public static void main(String[] args) {
        int i,n;
        System.out.println("enter the value is:");
        Scanner in = new Scanner(System.in);
         n = in.nextInt();
         for(i = 1;i<=n;i++){
             System.out.println("cube of "+i+" is : "+(i*i*i));
         }
    }
}
