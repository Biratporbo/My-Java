package youtubelrn;

public class MethodOverloading {
    static void change(int a){
        a = 98;
    }
    static void change2(int a){
        a = 98;
    }
    static void telljoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    public static void main(String[] args) {
        telljoke();
        int [] marks = {35,56,67,77,84,97};
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is: "+ x);
        
    }
}
