//To deterrmin the miles on the basis of given kilometers.
import java.util.Scanner;
public class kilomile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double km;
        System.out.println("Enter km: ");
        km = sc.nextDouble();

        double mile = km * 0.67;
        System.out.println("Mile is: "+mile);
    }
}