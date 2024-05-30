package jeon_javafx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private Label testLabel;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
