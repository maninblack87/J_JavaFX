package jeon_javafx;

import java.util.ArrayList;

public class SalaryManager {
    
    private ArrayList<Employee> employees;

    public SalaryManager(){
        employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees(){
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

}
