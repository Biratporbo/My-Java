package Learnpoint_ii;

public class trycatch {
    public static void main(String[] args) {
        int a =6000, b = 0;
        try {
            int c = a/b;
            System.out.println("The result is " + c);
        }
        catch (Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
        
    }
}
