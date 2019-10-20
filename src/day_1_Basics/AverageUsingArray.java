package day_1_Basics;

import java.util.Scanner;

public class AverageUsingArray {
    public static void main(String[] args) {
        int sum=0;
        int[] myArray= new int[5];
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the marks obtained in the five subjects:");
        for (int i=0; i<5; i++){
            myArray[i]= s1.nextInt();
        }
        for (int i=0; i<5; i++){
            sum+=myArray[i];
        }
        System.out.println("Average= " + (sum/5));
    }
}
