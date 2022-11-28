import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        int numberOfDaysInMonth = 0;
        String monthOfName = "unknown";

        Scanner in = new Scanner(System.in);
        System.out.println("enter the monthNumber:");
        int month = in.nextInt();

        System.out.println("enter the year:");
        int year = in.nextInt();

        switch (month){
            case 1:
                monthOfName = "january";
                numberOfDaysInMonth = 31;
                break;
            case 2:
                monthOfName = "february";
                numberOfDaysInMonth = 28;
                break;
            case 3:
                monthOfName = "march";
                numberOfDaysInMonth = 31;
                break;
            case 4:
                monthOfName = "april";
                numberOfDaysInMonth = 30;
                break;
            case 5:
                monthOfName = "may";
                numberOfDaysInMonth = 31;
                break;
            case 6:
                monthOfName = "june";
                numberOfDaysInMonth = 30;
                break;
        }
        System.out.println(monthOfName+"  "+year+"  "+ numberOfDaysInMonth +"days");
    }
}



