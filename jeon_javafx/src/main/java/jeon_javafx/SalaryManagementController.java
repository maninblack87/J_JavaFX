package jeon_javafx;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

import java.util.ArrayList;

import java.io.IOException;

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

    // 매니지먼트 시스템(manager객체)의 직원 리스트(employees배열) 전체 조회
    public void displayInfo(){
        salaryInfoContent.getChildren().clear();

        int i = 0;
        for (Employee employee : manager.getEmployees()) {
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

    // 버튼 "급여계산" 클릭 이벤트 처리
    public void addData(){

        // 입력된 값을 가지고 Employee 객체 만들기
        Employee employee = new Employee(iptName.getText(), Integer.parseInt(iptSalary.getText()), Integer.parseInt(iptBonus.getText()));

        // 매니지먼트 시스템(manager객체)에 있는 직원 리스트(employees배열)에 추가
        manager.addEmployee(employee);

        // 추가 후, 전체 조회 처리
        displayInfo();

    }

    // 버튼 "항목삭제" 클릭 이벤트 처리
    public void removeData(){

        // 가장 오래된 직원 항목 삭제
        manager.removeEmployee(manager.getEmployees().get(0));

        // 삭제 후, 전체 조회 처리
        displayInfo();

    }


    // 첫 화면으로 이동
    @FXML
    private void toPrimary() throws IOException{

        App.setRoot("primary");

    }

}
