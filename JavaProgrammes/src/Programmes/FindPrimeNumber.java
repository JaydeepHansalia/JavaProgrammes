package Programmes;

public class FindPrimeNumber {
    public static void main(String[] args){
        int i = 11;

        for(int j=2; j<i; j++) {
            if(i%j==0){
                System.out.println("Number is not prime");
                break;
            }
        }

    }
}
