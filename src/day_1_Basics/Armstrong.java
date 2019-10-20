package day_1_Basics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int a, b, sum= 0, product=1, temp, temp2, count=0;
        Scanner s1= new Scanner(System.in);
        a= s1.nextInt();
        temp= a;
        temp2= a;
        while (temp2>0){
            count++;
            temp2= temp2/10;
        }
        while (a>0){
            b= a%10;
            for (int i=0; i<count; i++){
                product*=b;
            }
            sum+=product;
            a= a/10;
        }
        if (sum==temp)
            System.out.println("Number is a armstrong.");
        else
            System.out.println("Number is not a armstrong.");
    }
}
