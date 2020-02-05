package day1;
import java.util.Scanner;
public class Profit {

    public static void main(String[] args) {
        Scanner tp = new Scanner(System.in);
        double revenue, costs, profit;

        System.out.println("Please enter the revenue cost");
        revenue = tp.nextDouble();
        System.out.println("Please enter the cost amount");
        costs = tp.nextDouble();
        profit= revenue - costs;


        System.out.println("The profit is " + profit);

    }
}
