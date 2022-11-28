import java.util.Scanner;

public class NumberOfWeeksDayAndPrintNameOfTheDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number is:");
        int day = in.nextInt();

        if(day==1) {
            System.out.println(" The day is Monday");
        }
        else if(day==2){
            System.out.println(" The day is Tuesday");
        }
        else if(day==3){
            System.out.println(" The day is Wednesday");
        }
        else if(day==4){
            System.out.println("The day is Thursday");
        }
        else if(day==5){
            System.out.println(" The day is Friday");
        }
        else if(day==6){
            System.out.println("The day is Saturday");
        }

    }
}
