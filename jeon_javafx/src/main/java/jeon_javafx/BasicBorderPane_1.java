package jeon_javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.Scene;

public class BasicBorderPane_1 extends Application {
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage basicBorderPaneStage_1) throws Exception{

        // Border 레이아웃 생성
        BorderPane bp = new BorderPane();

        // 레이블 5개 만들자
        Label top = new Label("Top");
        Label left = new Label("Left");
        Label right = new Label("Right");
        Label bottom = new Label("Bottom");
        Label center = new Label("Center");

        // Border 레이아웃에서 레이블 5개 border 레이아웃에 배치
        bp.setTop(top);
        bp.setLeft(left);
        bp.setRight(right);
        bp.setBottom(bottom);
        bp.setCenter(center);

        // 레이블 5개 속성 중 크기, 배경색, 중앙정렬 적용시켜주자
        top.setPrefWidth(300);
        top.setPrefHeight(20);
        left.setPrefWidth(40);
        left.setPrefHeight(160);
        right.setPrefWidth(40);
        right.setPrefHeight(160);
        bottom.setPrefWidth(300);
        bottom.setPrefHeight(20);
        top.setStyle("-fx-background-color: rgb(175, 200, 225)");
        left.setStyle("-fx-background-color: rgb(200, 225, 175)");
        right.setStyle("-fx-background-color: rgb(225, 200, 175)");
        bottom.setStyle("-fx-background-color: rgb(175, 225, 200)");
        center.setStyle("-fx-background-color: rgb(200, 175, 255)");

        // Stage 설정 마무리 및 시각화
        basicBorderPaneStage_1.setTitle("보더 레이아웃 1_1");
        basicBorderPaneStage_1.setScene(new Scene(bp, 300, 200));
        basicBorderPaneStage_1.show();
    }
}
