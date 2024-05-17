module jeon_javafx2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens jeon_javafx2 to javafx.fxml;
    exports jeon_javafx2;
}
