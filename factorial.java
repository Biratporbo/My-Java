import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, n, f=1;
        System.out.println("Enter a number: ");
        n = s.nextInt();

        for(i=1 ; i<=n ; i++){
            f = f * i;
        }
        System.out.println("Factorial is: "+f);
    }
}