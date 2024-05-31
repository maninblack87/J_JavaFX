package jeon_javafx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class PrimaryController {

    // 페이지 이동 : 2번째 페이지
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    // 덧셈으로 계산
    @FXML
    private TextField num1;
    @FXML
    private TextField num2;
    @FXML
    private Label result;
    @FXML
    private void calculateSum() throws IOException {

        
        try{
            // num1과 num2에서 입력된 값을 읽어옴
            int number1 = Integer.parseInt(num1.getText());
            int number2 = Integer.parseInt(num2.getText());

            // 두 숫자의 합을 계산
            int sum = number1 + number2;

            // 결과를 result에 표시
            result.setText(Integer.toString(sum));
        }catch(NumberFormatException e){
            result.setText("유효한 숫자를 입력하세요.");
        }

    }
    
}
