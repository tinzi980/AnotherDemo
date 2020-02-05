package day1;

import java.util.*;
        public class widgets {
            public static void main(String[] args) {

                int widgets;

                double charge = 0.0;

                Scanner tp = new Scanner(System.in);
                System.out.println("Please enter the number of widgets");
                widgets = tp.nextInt();
                if (widgets < 100) {

                    charge = widgets * 0.25;
                    System.out.printf("the cost is %.2f ", charge);

                } else if (widgets >= 100) {
                    charge = widgets * 0.20;
                    System.out.printf("the cost is %.2f ", charge);

                } else {
                    System.out.println("invalid bagels");
                }
            }
        }











