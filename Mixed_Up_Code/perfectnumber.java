import java.util.Scanner;
public class perfectnumber {
   public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int i, n, sum=0;
        System.out.println("Enter a number: ");
        n = s.nextInt();

        for(i=1; i<n; i++){
           if(n%i == 0){
                sum += i;
           } 
        }
        if(sum == n){
            System.out.println(n+"is a perfect number: ");
        }else{
            System.out.println(n+"is not a perfect number: ");
        }
    } 
}
