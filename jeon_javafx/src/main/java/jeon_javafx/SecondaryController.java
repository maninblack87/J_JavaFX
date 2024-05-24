package jeon_javafx;

import javafx.fxml.FXML;
import java.io.IOException;

public class SecondaryController{
    @FXML
    private void switchToPrimary() throws IOException{
        App.changeRoot("primary");
    }
    @FXML
    private void switchToTertiary() throws IOException{
        App.changeRoot("tertiary");
    }
}