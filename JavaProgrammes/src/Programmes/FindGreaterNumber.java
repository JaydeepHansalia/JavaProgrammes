package Programmes;

public class FindGreaterNumber {

    public static void main(String[] args){
        int a= 34;
        int b= 50;
        int c= 33;
        System.out.println(a>b?""+a+" is greater number":""+b+" is greater number");

        if(a>b & a>c){
            System.out.println("a is greater number");
        }else if(b>c){
            System.out.println("b is greater number");
        }else{
            System.out.println("c is greater number");
        }
    }
}
