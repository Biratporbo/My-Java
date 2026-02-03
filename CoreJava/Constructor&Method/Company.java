class Employee{
    String name;
    double salary;

    //Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //Method
    void getInfo(double amount){
        salary += amount;
        System.out.println(name + " new salary: " + salary);
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit",300000);
        Employee e2 = new Employee("Birat",600000);
        Employee e3 = new Employee("Rohit", 450000);
        e1.getInfo(50000);
        e2.getInfo(90000);
        e3.getInfo(35000);
    }
}