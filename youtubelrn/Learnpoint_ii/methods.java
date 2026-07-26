package Learnpoint_ii;

public class methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }else{
            z = (x+y) * 5;
        }
        return z;
    }
    
    public static void main(String[] args){
        int a = 5, b = 7;
        int c;
        // method obj = new methods();
        //c = obj.logic(a,b);
        c = logic(a,b);
        int a1 = 2, b1 = 1;
        int c1; 
        c1 =logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}