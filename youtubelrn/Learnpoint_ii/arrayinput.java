package Learnpoint_ii;

import java.util.Scanner;
public class arrayinput {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] arr = {23,45,233,543,3};
        System.out.println(arr[1]);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
