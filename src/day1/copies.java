package day1;
import java.util.*;

public class copies {
    public static void main(String[] args) {
        int copies;
        double total=0.0;
        Scanner tp = new Scanner(System.in);
        System.out.println("please enter the number of copies");
        copies=tp.nextInt();
        if (copies >1 && copies <= 100){
            total =copies*0.05;
            System.out.printf("the cost of copies is %.2f", total);


        }else if (copies >= 100){
            total=((100-copies)*0.03)+(copies*0.05);
            System.out.printf("the cost of copies is %.2f" , total);


        }
        else {
            System.out.println("wrong entry");
        }


    }
}
