package day1;

import java.util.*;

public class quiz {
    public static void main(String[] args) {
        String strName;
        Scanner tp=new Scanner(System.in);
        System.out.println("who was the first ronald Mcdonald");
        strName = tp.nextLine();

        if(strName.equals("Willard Scott")){
            System.out.println("correct");
        }else{
            System.out.println("nice try");
        }

    }

}
