package jeon_javafx;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    // 페이지 이동 : 2번째 페이지
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToCalculator() throws IOException {
        App.setRoot("calculator");
    }
    @FXML
    private void switchToSalaryManagementButton() throws IOException {
        App.setRoot("salaryManagement");
    }
    
}
