package pattern;

import java.util.Scanner;
public class crosspattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int x = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i == j || j == (n-i+1)){ //(n-i+1) is used to get the reverse diagonal
                    System.out.print("*");
                }else{  
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }
}
