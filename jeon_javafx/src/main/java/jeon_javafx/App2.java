package jeon_javafx;

import javafx.application.Application;
import java.io.IOException;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class App2 extends Application {

    // 변수 선언
    // scene : 렌더링할 내용
    private static Scene scene;

    // 자바fx 애플리케이션이 실행 될 때 호출됨
    @Override
    public void start(Stage stage) throws IOException{

        // scene 렌더링할 내용
        scene = new Scene(loadFXML("secondary"), 800, 600);

        // 자바fx에서 scene 객체에 style.css 스타일을 적용
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        // stage를 설정 : 1.제목 , 2.Scene , 3.화면에 표시
        stage.setTitle("전석환의 자바FX");
        stage.setScene(scene);
        stage.show();

    }
    
    // scene 객체 루트 노드 변경
    static void setRoot(String fxml) throws IOException{
        scene.setRoot(loadFXML(fxml));
    }

    // fxml파일을 로드하고 반환
    private static Parent loadFXML(String fxml) throws IOException{

        // 클래스 경로에서 FXML파일을 찾기위한 URL을 반환
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));

        // FXML 파일을 읽어들이기
        return fxmlLoader.load();
    }

    // 자바FX 런타임을 초기화하고, 애플리케이션 스레드에서 start()호출
    public static void main(String[] args) {
        launch();
    }
        

}


