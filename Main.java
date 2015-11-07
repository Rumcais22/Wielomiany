package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=2, b=-3, c=-8;
        double delta=b*b-4*a*c;
        if (delta==0){
            System.out.println("To nie jest funkcja kwadratowa");
        }else{

            if (delta<0){
                System.out.println("delta < 0");

            }if(delta==0){
                System.out.println("Rownanie ma 1 pierwiastek, x1: " + (-b/(2*a)) );
            }if(delta>0){
                System.out.println("x1: " + (-b-Math.sqrt(delta))/2*a );
                System.out.println("x2: " + (-b+Math.sqrt(delta))/2*a );


      




            }
        }

    }
}
