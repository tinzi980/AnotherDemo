package day2;
public class loop3{
    public static void main(String[] args) {
        int count =1;
        int sum=0;
        do{
            System.out.println(count);

            sum=sum+count;
            count++;

        }
        while (count <= 3);
        System.out.println(sum);
    }



}
