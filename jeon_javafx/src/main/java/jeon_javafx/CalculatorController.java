package jeon_javafx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class CalculatorController {

    // calculator.fxml에서 fx:id를 가져온다
    @FXML
    private TextField iptNum1;
    @FXML
    private TextField iptNum2;
    @FXML
    private Label operation;
    @FXML
    private Label result;

    // 처음으로 돌아간다
    @FXML
    private void goPrimary() throws IOException{
        App.setRoot("primary");
    }

    // 연산 타입을 변환한다
    @FXML
    private void operSum() throws IOException{
        result.setText(Integer.toString(Integer.parseInt(iptNum1.getText())+Integer.parseInt(iptNum2.getText())));
    }
    @FXML
    private void operSub() throws IOException{
        result.setText(Integer.toString(Integer.parseInt(iptNum1.getText())-Integer.parseInt(iptNum2.getText())));
    }
    @FXML
    private void operMul() throws IOException{
        result.setText(Integer.toString(Integer.parseInt(iptNum1.getText())*Integer.parseInt(iptNum2.getText())));
    }
    @FXML
    private void operDiv() throws IOException{
        result.setText(Integer.toString(Integer.parseInt(iptNum1.getText())/Integer.parseInt(iptNum2.getText())));
    }
    
}
