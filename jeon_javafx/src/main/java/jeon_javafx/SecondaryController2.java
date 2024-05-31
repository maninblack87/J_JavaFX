package jeon_javafx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class SecondaryController2 {
    
    // 페이지 1로 이동 기능 >>>
    @FXML
    private void switchToPrimary() throws IOException{
        App.setRoot("primary");
    }

    // 드래그 드롭 이동 기능 >>>
    private double orgSceneX, orgSceneY;
    private double orgTranslateX, orgTranslateY;

    // 드래그 시작 이벤트 처리
    @FXML
    private void handleMousePressed(MouseEvent event){

        // 마우스 이벤트가 발생한 시점에서 마우스 좌표를 가져옴

        // 레이블이 현재위치한 좌표를 가져옴

    }

    // 드래그 중인 동안 이벤트 처리
    @FXML
    private void handleMouseDragged(MouseEvent event){

        // x축, y축 옵셋을 구한다

        // 레이블에 새롭게 설정될 좌표를 구한다

        // 이벤트가 발생한 레이블의 위치를 새롭게 설정

    }

    // 드래그 끝에 이벤트 처리
    @FXML
    private void handleMouseReleased(MouseEvent event){
        
        // !? 추가 작업 수행 가능

    }

}