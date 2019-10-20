package day_1_Basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int a, b, sum= 0, temp;
        Scanner s1= new Scanner(System.in);
        a= s1.nextInt();
        temp= a;
            while (a>0){
                b= a%10;
                sum= (sum*10) + b;
                a=a/10;
        }
            if (sum==temp)
                System.out.println("Number is a palindrome.");
            else
                System.out.println("Number is not a palindrome.");
    }
}
