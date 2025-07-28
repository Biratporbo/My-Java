//Find LCM of 2 Numbers

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM: " + lcm);
    }

    static int gcd(int x, int y){
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
    return x;
    }
}