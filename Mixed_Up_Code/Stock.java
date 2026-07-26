import java.util.Scanner;
public class Stock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        double pv , ts;

        System.out.println("Enter product value : ");
        pv = sc.nextDouble();

        System.out.println("Enter total stock: ");
        ts = sc.nextDouble();

        double tsv = pv * ts;
        System.out.println("Enter total stock value : "+tsv);
    }
}