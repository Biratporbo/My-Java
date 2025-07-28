//Read Number From Standard Input

import java.util.Scanner;

public class Readnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        System.out.println("Your number: " + number);
    }
}