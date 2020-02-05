package day2;
import java.util.*;
public class calculatingSales {
    public static void main(String[] args) {


        double price = 0.0;
        double total = 0.0;
        double totalValue = 0.0;
        int products = 0;
        int quantity = 0;


        Scanner tp = new Scanner(System.in);
        System.out.println("enter product number");
        products = tp.nextInt();




        if (products == -999 && price <= 0) {
            System.out.println("thank you for using the machine");
            System.exit(0);

        } else {
            System.out.println("The total is " + total);

            while (products != -999 && products >= 1 && products <= 5) {


                System.out.println("enter quantity");

                quantity = tp.nextInt();


                switch (products) {


                    case 1:

                        price = 2.98;
                        totalValue = price * quantity;
                        System.out.println("the price is " + price);
                        break;


                    case 2:

                        price = 4.50;
                        totalValue = price * quantity;
                        System.out.println("the total value is" + totalValue);
                        break;
                    case 3:

                        price = 9.98;
                        totalValue = price * quantity;
                        System.out.println("the total value is" + totalValue);
                        break;

                    case 4:

                        price = 4.49;
                        totalValue = price * quantity;
                        System.out.println("the total value is" + totalValue);
                        break;

                    case 5:
                        price = 6.87;
                        totalValue = price * quantity;
                        System.out.println("the total value is" + totalValue);
                        break;
                    default:
                        System.out.println("invalid entry");

                        /*System.out.println("enter product number");
                        products = tp.nextInt();*/
                }//switch

                System.out.println("please enter quantity");
                products = tp.nextInt();


                total = total + totalValue;

                System.out.println("the total is " + total);
            }//while

        }
    }
}
