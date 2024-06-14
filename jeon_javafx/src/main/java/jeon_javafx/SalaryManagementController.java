package jeon_javafx;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class SalaryManagementController implements Initializable {

    private SalaryManager manager = new SalaryManager();

    @FXML
    private GridPane salaryInfoContent;

    @FXML
    private TextField iptName;
    @FXML
    private TextField iptSalary;
    @FXML
    private TextField iptBonus;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        displayInfo();
        
    }

    public void displayInfo(){

        int i = 0;
        for (Employee employee : manager.employees) {
            Label name = new Label(employee.getName());
            GridPane.setConstraints(name, 0, i);
            Label salary = new Label(Double.toString(employee.getSalary()));
            GridPane.setConstraints(salary, 1, i);
            Label bonus = new Label(Double.toString(employee.getBonus()));
            GridPane.setConstraints(bonus, 2, i);
            Label totalSalary = new Label(Double.toString(employee.getTotalSalary()));
            GridPane.setConstraints(totalSalary, 3, i);
            Label tax = new Label(Double.toString(employee.getTax()));
            GridPane.setConstraints(tax, 4, i);
            Label netSalary = new Label(Double.toString(employee.getNetSalary()));
            GridPane.setConstraints(netSalary, 5, i);

            name.getStyleClass().add("tableLabel");
            salary.getStyleClass().add("tableLabel");
            bonus.getStyleClass().add("tableLabel");
            totalSalary.getStyleClass().add("tableLabel");
            tax.getStyleClass().add("tableLabel");
            netSalary.getStyleClass().add("tableLabel");

            salaryInfoContent.getChildren().addAll(name, salary, bonus, totalSalary, tax, netSalary);

            i++;
        }

    }

    public void addData(){

        manager.addEmployee(iptName.getText(), Integer.parseInt(iptSalary.getText()), Integer.parseInt(iptBonus.getText()));

        displayInfo();

    }

    public void initInfo(){

        manager = new SalaryManager();

        displayInfo();

    }

}
