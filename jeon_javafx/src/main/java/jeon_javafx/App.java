package jeon_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;

/**
 * JavaFX App
 */
public class App extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("JavaFX Example1 Codding");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}