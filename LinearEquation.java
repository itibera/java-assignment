/* 1. A set of two linear equations with two unknowns x1 and x2 is given below:
ax1 + bx2 = m
cx1 + dx2 = n
The set has a unique solution:
x1 = (md – bn ) / ( ad – bc )
x2 = ( na – mc ) / (ad – bc)
provided the denominator ad- bc ≠ 0 .Write a program that will read the values of constants a, b, c,
d ,m and n and computes the values of x1 & x2.An appropriate message should be printed when
(ad-bc)=0. */

import java.util.Scanner;
class LinearEquation {
    public static void  main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = scan.nextInt();
        System.out.print("Enter the value of b = ");
        int b = scan.nextInt();
        System.out.print("Enter the value of c = ");
        int c = scan.nextInt();
        System.out.print("Enter the value of d = ");
        int d = scan.nextInt();
        System.out.print("Enter the value of m = ");
        int m = scan.nextInt();
        System.out.print("Enter the value of n = ");
        int n = scan.nextInt();
        if(a*d - b*c == 0){
            System.out.println("denominator is zero we can't calculate");

        }else{
            double x1 = (m*d - b*n)/(a*d - b*c);
            double x2 = (n*a - m*c)/(a*d - b*c);
            System.out.println("value of x1="+x1);
            System.out.println("value of x2="+x2);
        }
        

    }
}