import java.util.Scanner;
public class Discount {
    public static void main(String args[]){

        double p, q, t, d,f;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the quantity of the product: ");
        q = s.nextDouble();

        System.out.println("Enter the price of each product: ");
        p = s.nextDouble();

        t = p * q;
        System.out.println("Total price: " +t);
        
        if(t > 500)
        {
            f = (t * 15)/100;
            d = (t - f);
            System.out.println("Price of the product after discount: "+d);
        }
        else
        {
            System.out.println("Price of the product without discount: "+t);
        }
    }
}