package day_1_Basics;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the temperature in degree celsius: ");
        int c= s1.nextInt();
        System.out.println("Temperature in degree fahrenheit= " + (float)(c*1.8));
    }
}
