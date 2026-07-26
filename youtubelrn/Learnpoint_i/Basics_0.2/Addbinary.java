// Add Two Binary in Strings

import java.util.Scanner;

public class Addbinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = "1010" , b1 = "1001";
        int sum = Integer.parseInt(a1,2) + Integer.parseInt(b1, 2);
        
        System.out.println("Sum: " + Integer.toBinaryString(sum));
    }   
}