module sample_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens sample_javafx to javafx.fxml;
    exports sample_javafx;
}
