package jeon_javafx;

import javafx.fxml.FXML;
import java.io.IOException;

public class TertiaryController {
    @FXML
    private void switchToSecondary() throws IOException{
        App.changeRoot("secondary");
    }
}
