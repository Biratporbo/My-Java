import java.util.Scanner;
public class divisor {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int number, i;
        System.out.println("Enter the number: ");
        number = s.nextInt();

        System.out.println("Divisors of "+ number +" are: ");
        for(i=1; i<=number; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
}
 