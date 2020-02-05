package day1;
import java.util.Scanner;
public class salary {
    public static void main(String[] args) {


        Scanner tp = new Scanner(System.in);
        double salary;
        int hours;
        int rate;
        System.out.println("Please enter hours worked");
        hours = tp.nextInt();
        System.out.println("please enter the rate of pay");
        rate = tp.nextInt();

        salary = hours * rate;

        System.out.printf("The salary of the employee is %.2f", salary);




    }
}
