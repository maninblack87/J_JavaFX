package jeon_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    // 변수 선언
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        // Scene은 Stage안에 렌더링 될 내용을 가리킨다
        scene = new Scene(loadFXML("primary"), 800, 600);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        // Stage는 최상위 창을 가리킨다
        stage.setTitle("전석환의 자바FX");
        stage.setScene(scene);
        stage.show();

    }

    // Scene객체의 루트 노드를 정의 혹은 변경
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    // 주어진 FXML 파일을 로드하고 반환
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    // 자바FX 런타임을 초기화, 애플리케이션 스레드에서 start()호출
    public static void main(String[] args) {
        launch();
    }

}