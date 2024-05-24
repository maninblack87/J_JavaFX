package jeon_javafx;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException{
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    // Scene의 루트를 변경
    static void changeRoot(String fxml) throws IOException{

        // 매개변수 fxml에 해당하는 FXML 파일을 로드하고, 이것을 Scene의 새로운 루트로 설정
        scene.setRoot(loadFXML(fxml));

    }

    // FXML파일을 로드하는 함수
    private static Parent loadFXML(String fxml) throws IOException{

        // 인자(fxml)를 가지고 FXML파일을 로드하는 클래스 FXMLLoader의 객체 fxmlLoader 생성
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));

        // 실제로 로드
        return fxmlLoader.load();

    }

}