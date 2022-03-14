package Programmes;

public class FindFactorialNumber {

    public static void main(String[] args){
        int fact = 4;
        int no=1;

        for(int i=fact; i>0; i--){
            no=no*i;
        }
        System.out.println(no);
    }
}
