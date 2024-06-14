package jeon_javafx;

import java.util.ArrayList;

public class SalaryManager {
    
    public ArrayList<Employee> employees;

    public SalaryManager(){
        employees = new ArrayList<>();
    }

    public void addEmployee(String name, int salary, int bonus){
        Employee employee = new Employee(name, salary, bonus);
        employees.add(employee);
    }

    public void removeEmployee(){

    }

}
