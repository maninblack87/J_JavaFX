module jeon_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens jeon_javafx to javafx.fxml;
    exports jeon_javafx;
}
