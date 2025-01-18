package com.thetechbull.controlStraments;

public class IfAndElseDemo {

    public static void main(String[] args) {
        //take 3 int numbers and find the greatest number
        int a = 10;
        int b = 20;
        int c = 30;

        if(a>b && a>c){
            System.out.println("A is greatest number");
        }else if(b>c){
            System.out.println("B is greatest number");
        }
        else{
            System.out.println("C is greatest number");
        }
        System.out.println("************another way for same program***********");
        //modify the above code to java 8 code

        int greatest = a>b && a>c ? a : b>c ? b : c;
        System.out.println("Greatest number is: "+greatest);


    }
}
