package day1;
import java.util.*;
public class Bagels {
    public static void main(String[] args) {

        int bagels;

        double charge=0.0;

        Scanner tp=new Scanner(System.in);
        System.out.println("Please enter the number of bagels");
        bagels=tp.nextInt();
        if (bagels >0 && bagels < 6 ){


            charge = bagels*0.75;
            System.out.printf("the cost is %.2f ", charge);

    }

        else if (bagels >=6 ){
                charge =bagels*0.60;
            System.out.printf("the cost is %.2f ", charge);

        }else {
            System.out.println("invalid bagels");
        }




    }
}
