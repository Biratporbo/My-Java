package youtubelrn;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+ name);
    }

    public int getsalary(){
        return salary;
    }
}


public abstract class student {
    public static void main(String[] args) {
        System.out.println("This is our class!");
        Employee Rahul = new Employee();
        Rahul.id = 102;
        Rahul.salary = 34;
        Rahul.name = "CodewithTech";

        Employee Virat = new Employee();
        Virat.id = 108;
        Virat.salary = 30;
        Virat.name = "CodeMasala";

        Rahul.printDetails();
        Virat.printDetails();

        int salary = Virat.getsalary();
        System.out.println(salary);

        // System.out.println(Rahul.id);
        // System.out.println(Rahul.name);

    }
}