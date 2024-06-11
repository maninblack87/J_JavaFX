module jeon_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.poi;

    opens jeon_javafx to javafx.fxml;
    exports jeon_javafx;
}
