package jeon_javafx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class SecondaryController {

    // 페이지 1로 이동
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    // 드래그 드롭 이동 >>>
    private double orgSceneX, orgSceneY;            // .. origin
    private double orgTranslateX, orgTranslateY;

    // 드래그 시작 이벤트 처리
    @FXML
    private void handleMousePressed(MouseEvent event){

        // 마우스 이벤트가 발생한 시점에서 마우스의 좌표를 가져옴 
        orgSceneX = event.getSceneX();
        orgSceneY = event.getSceneY();  

        // 레이블이 현재 위치한 좌표를 가져옴 
        // >> ((Label)(event.getSource())) >> 이벤트가 발생한 소스를 레이블로 가져옴
        // >> getTranslateX()              >> 레이블의 현재 x축 이동값을 가져옴
        orgTranslateX = ((Label)(event.getSource())).getTranslateX();   
        orgTranslateY = ((Label)(event.getSource())).getTranslateY();

    }

    // 드래그 중인 동안 이벤트 처리
    @FXML
    private void handleMouseDragged(MouseEvent event){

        // x축, y축 옵셋을 구한다
        double offsetX = event.getSceneX() - orgSceneX;
        double offsetY = event.getSceneY() - orgSceneY;

        // 레이블에 새롭게 설정될 좌표를 구한다
        double newTranslateX = orgTranslateX + offsetX;
        double newTranslateY = orgTranslateY + offsetY;

        // 이벤트가 발생한 레이블의 위치를 새롭게 설정
        ((Label)(event.getSource())).setTranslateX(newTranslateX);
        ((Label)(event.getSource())).setTranslateY(newTranslateY);
    }

    // 드래그 끝 이벤트 처리
    @FXML
    private void handleMouseReleased(MouseEvent event){
        // ?! 추가 작업 수행 가능
    }

}