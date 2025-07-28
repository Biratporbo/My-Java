//Add two Complex number

import java.util.Scanner;

public class Complexno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = 2 , a2 = 4;
        int b1 = 6, b2 = 8;
        int real = a1 + a2;
        int imag = b1 + b2;
        
        System.out.println("Sum: " + real + " + " + imag + "i");
    }
}
