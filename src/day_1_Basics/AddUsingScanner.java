package day_1_Basics;
// Task 4: Write a program to accept two number from the user and then add them.(Hint: Use scanner class)
import java.util.Scanner;
public class AddUsingScanner {

    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        int a= s1.nextInt();
        int b= s1.nextInt();
        System.out.println("a=" + a + "\nb=" + b);
        System.out.println("Addition=" + (a+b));
    }
}
