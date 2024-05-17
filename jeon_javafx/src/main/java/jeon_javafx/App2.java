package jeon_javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;

public class App2 extends Application {
    @Override
    public void start(Stage secondaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);
        
        secondaryStage.setTitle("JavaFX 1 Secondary");
        secondaryStage.setScene(scene);
        secondaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
