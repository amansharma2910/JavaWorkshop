package day_1_Basics;

import java.util.Scanner;

public class Factorial{
    int num;
    public void factorial(int num){
        this.num= num;
        if (num>0){
            int product= 1;
            for (int i=num; i>0; i--){
                product*=i;
            }
            System.out.println("Factorial=" + product);
        }

    }

    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter the number you want the factorial of: ");
        int n= s1.nextInt();
        Factorial f1= new Factorial();
        f1.factorial(n);


    }
}
