//Write a Java program to find a maximum of three numbers.

import java.util.*;
public class findMaximumFromThreeNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers below.");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b && a>c) {
            System.out.println("The largest number is: "+a);
        }
        else if (b>a && b>c) {
            System.out.println("The largest number is: "+b);
        }
        else {
            System.out.println("The largest number is: "+c);
        }
    }
}