/*
2. For a certain electrical circuit with an inductance L and resistance R, the damped natural frequency
is given by:

Frequency = √ [( 1 / LC ) – ( R2/4C2 )]

It is desired to study the variations of the frequency with C (capacitance). Write a program to
calculate the frequency of difference values of C starting 0.01 to 0.1 in steps of 0.01.
*/
import java.util.Scanner;
import java.lang.Math;

class LCRFrequency {
    public static void  main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of L = ");
        int l = scan.nextInt();
        System.out.print("Enter the value of R = ");
        int r = scan.nextInt();
        double c = 0.01;
        while(c <= 0.1) {
            double freq = Math.sqrt((1/(l*c)) - (r/(4*c)));
            System.out.println("Frequency for " + c + " capacitance is " + freq);
            c = c + 0.01;
        }
    }
}