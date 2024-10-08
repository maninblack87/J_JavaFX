package jeon_javafx;

import javafx.application.Application;
import java.io.IOException;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class App1 extends Application{

    // 변수 선언 : Scene 렌더링 할 내용
    private static Scene scene;

    @Override 
    public void start(Stage stage) throws IOException{

        // Scene 초기화 : stage에 렌더링 될 내용
        scene = new Scene(loadFXML("primary"), 800, 600);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        // Stage 설정
        stage.setTitle("전석환의 자바FX");
        stage.setScene(scene);
        stage.show();

    }

    // Scene 객체 루트 노드 설정 및 변경
    static void setRoot(String fxml) throws IOException{
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String args[]){
        launch();
    }

}