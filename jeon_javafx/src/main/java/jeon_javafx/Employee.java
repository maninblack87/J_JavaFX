package jeon_javafx;

public class Employee {

    private String name;
    private double salary;
    private double bonus;

    public Employee(String name, double salary, double bonus){
        this.name   = name;
        this.salary = salary;
        this.bonus  = bonus;
    }
    
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public double getBonus(){
        return bonus;
    }

    public double getTotalSalary(){
        return salary + bonus;
    }

    public double getTax(){
        return getTotalSalary() * 0.1;
    }

    public double getNetSalary(){
        return getTotalSalary() - getTax();
    }
    
}
