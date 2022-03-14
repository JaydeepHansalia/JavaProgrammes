package Programmes;

public class ReverseNumber {

    public static void main(String[] args){
        int rev=0;
        int no=143;
        int r;

        while(no>0){
            r=no%10;
            rev=rev*10+r;
            no=no/10;
        }
        System.out.println(rev);
    }
}
