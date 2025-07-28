import java.util.Scanner;

public class LargestnoThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /* if(a > b){
            System.out.println(a + "is a greater number");
        }else{
            System.out.println(b + "is a greater number");
        }if(a > c){
            System.out.println(a + "is a greater number");
        }else{
            System.out.println(c + "is a greater number");
        }*/


        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c ) ? b : c);
        System.out.println("Largest: " + largest);
    }
}
