class Employee{
    //Encapsulation with private fields
    private String name;
    private double salary;

    //Constructor creation
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    //Public Getter
    public String getName(){
        return name;
    }

    //Public setter with validation
    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }else{
            System.out.println("Invalid salary amount");
        }
    }
    
    public double getSalary(){
        return salary;
    }
}



public class Comp{
    public static void main(String[] args){
        Employee emp1 = new Employee("Birat", 800000);
        Employee emp2 = new Employee("Ashish", 750000);
        Employee emp3 = new Employee("Vishal", 960000);
    }
}