package day1;
import java.util.Scanner;


public class circle {
    public static void main(String[] args) {
        Scanner tp = new Scanner(System.in);
        int radius;
        double diameter;
        double circumference;
        double area;
            final double pie= 3.14159;


        System.out.println("enter the radius of the circle");
        radius = tp.nextInt();

        diameter= 2 * radius;
        circumference= 2*pie * radius;
        area = pie * radius * radius;
        System.out.println("The diameter of the circle is" + diameter);
        System.out.println("the circumference of the circle is" + circumference);
        System.out.println("The area of the circle is "+ area);

    }
}
