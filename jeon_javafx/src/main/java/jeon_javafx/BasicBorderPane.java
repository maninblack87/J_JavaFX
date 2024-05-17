package jeon_javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.Scene;

public class BasicBorderPane extends Application {
    public static void main(String[] args){
        launch();
    }
    @Override
    public void start(Stage basicBorderPaneStage) throws Exception{
        BorderPane bp = new BorderPane();
        
        // Label 5개 생성
        Label top = new Label("Top");
        Label left = new Label("Left");
        Label right = new Label("Right");
        Label bottom = new Label("Bottom");
        Label center = new Label("center");

        // Label 5개 속성
        top.setPrefWidth(300);
        top.setPrefHeight(20);
        bottom.setPrefWidth(300);
        bottom.setPrefHeight(20);
        top.setStyle("-fx-alignment: center; -fx-background-color: lightblue;");
        bottom.setStyle("-fx-alignment: center; -fx-background-color: orange;");

        // border 레이아웃에 Label 배치
        bp.setTop(top);
        bp.setLeft(left);
        bp.setRight(right);
        bp.setBottom(bottom);
        bp.setCenter(center);

        // Stage 설정 및 시각화
        basicBorderPaneStage.setTitle("Border Pane 레이아웃");
        basicBorderPaneStage.setScene(new Scene(bp, 300, 200));
        basicBorderPaneStage.show();
    }
}
