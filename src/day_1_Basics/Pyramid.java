package day_1_Basics;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int a;
        Scanner s1= new Scanner(System.in);
        a= s1.nextInt();
        for (int i=0; i<=a; i++){
            for (int b= 1; b<=i; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=(a-1); i>=0; i--){
            for (int b= 1; b<=i; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
