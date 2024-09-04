package jeon_javafx;

import javafx.application.Application;
import java.io.IOException;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class App3 extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException{

        // 스테이지에 렌더링 될 내용(Scene)을 생성한다
        scene = new Scene(loadFXML("primary"), 800, 600);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        // 스테이지에 Scene을 배치한다
        stage.setScene(scene);

    }

    // Scene 객체의 루트 노드를 변경
    static void setRoot(String fxml) throws IOException{
        scene.setRoot(loadFXML(fxml));
    }

    // 주어진 FXML 파일을 로드하고 반환
    private static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
}
