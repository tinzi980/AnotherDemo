package day2;
import java.util.*;
public class gasMileage {
    public static void main(String[] args) {

        int miles =0, gallons=0;
        double mileGallon=0.0 , milesGallonTotal = 0.0 ;
        Scanner tp = new Scanner(System.in);
        System.out.println("enter the miles driven");
        miles=tp.nextInt();


        while(miles != -999){

            System.out.println("enter the gallons used");
            gallons = tp.nextInt();
            mileGallon = miles/gallons ;
            milesGallonTotal = milesGallonTotal + mileGallon;


            System.out.println("enter the miles driven");
            miles=tp.nextInt();

            System.out.println("the miles per gallons are" + mileGallon);
            //System.out.println("enter the miles driven");
            //miles=tp.nextInt();
            System.out.println("the total miles per gallon" + milesGallonTotal);
        }



    }
}
