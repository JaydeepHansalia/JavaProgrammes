package Programmes;

public class FindNumberOfDigits {

    public static void main(String[] args){
        int no=12345678;
        int count=0;

        while(no>0){
            no=no/10;
            count++;
        }
        System.out.println(count);
    }
}
