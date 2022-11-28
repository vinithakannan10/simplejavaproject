import java.util.Scanner;

public class DeterminesStudentsGrade {
    public static void main(String[] args) {

        float Midterm_score,HalfYearly_score,Annual_score,Average;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Midterm score:");
        Midterm_score= in.nextFloat();

        System.out.println("Enter your HalfYearly score:");
        HalfYearly_score = in.nextFloat();

        System.out.println("Enter your Annual score:");
        Annual_score = in.nextFloat();

         Average = (Midterm_score + HalfYearly_score + Annual_score) / 3;
        if(Average>=90) {
            System.out.println("your grade A");
        }
       else if((Average>=70) && (Average<90)){
            System.out.println("your grade B");
        }
       else if ((Average>=50)&&(Average<70)) {
            System.out.println("your grade C");
        }
            else if(Average<50){
            System.out.println("your grade F");
            }
            else{
            System.out.println("invalid");
            }
    }
}
