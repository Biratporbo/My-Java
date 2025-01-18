package youtubelrn;

class Parent{
    void salary(){
        System.out.println("Salary: 200000");
    }
}
class Programmer extends Parent{
    void bonus(){
        System.out.println("Bonus: 50000");
    }
}

public abstract class Singletrycatch {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.salary();
        p.bonus();
    }
}
