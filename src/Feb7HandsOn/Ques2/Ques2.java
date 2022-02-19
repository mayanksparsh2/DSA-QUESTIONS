package  Feb7HandsOn.Ques2;
import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("is a leap year " + year);
        } else if (year % 100 == 0) {
            System.out.println("is not a leap year " + year);
        } else if (year % 4 == 0) {
            System.out.println("is a leap year " + year);
        } else {
            System.out.println("is not a leap year " + year);
        }
    }
}