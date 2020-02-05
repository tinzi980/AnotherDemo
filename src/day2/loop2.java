package day2;

public class loop2 {

    public static void main(String[] args) {
        int count = 1;
        int total = 0;
        while (count <= 3) {
            System.out.println("count is " + count);

            total = total + count;
            count++;


        }
        System.out.println(total);
    }


}
