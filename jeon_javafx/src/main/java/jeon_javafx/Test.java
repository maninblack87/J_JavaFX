package jeon_javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Test extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 버튼 생성
        Button btn = new Button("Click Me");

        // 레이아웃 생성
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Scene 생성
        Scene scene = new Scene(root, 300, 200);

        // Stage 설정
        primaryStage.setTitle("Simple JavaFX Application");
        primaryStage.setScene(scene); // Scene을 Stage에 설정
        primaryStage.show(); // Stage를 화면에 표시
    }

    public static void main(String[] args) {
        launch(args);
    }
}