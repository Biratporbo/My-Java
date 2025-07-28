//Find GCD or HCD between two numbers

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println("GCD : " + x);
    }
}

