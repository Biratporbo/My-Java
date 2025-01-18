import java.util.Scanner;
public class absolute {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double abs;
        System.out.println("Enter a number: ");
        abs = s.nextDouble();
        if(abs<0)
        {
            abs*=(-1);
            System.out.println("Absolute Value: "+abs);
        }
        else
        {
            System.out.println("Absolute Value: "+abs);
        }
    }
}
