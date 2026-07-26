//Get Input from the User

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
