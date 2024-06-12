package jeon_javafx;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

import java.util.ArrayList;

public class CarManagementController implements Initializable {

    @FXML
    private VBox carInfoContainer;

    // CarManagementController 클래스를 생성하면 자동으로 실행되는 함수이다.
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

        // 자동차 객체 생성
        Car c1 = new Car("현대", 2, "제네시스1");
        Car c2 = new Car("기아", 5, "제네시스2");

        // 자동차 관시 시스템 생성
        CarManagementSystem mngsys = new CarManagementSystem();

        // 라벨 생성 및 VBox에 추가
        for (Car car : mngsys.cars){

            // 하나의 자동차 정보를 "가로로" 표시할 HBox를 생성한다
            HBox carInfoBox = new HBox();
            carInfoBox.setAlignment(Pos.CENTER);

            // 하나의 자동차 정보가 저장될 레이블을 생성한다
            Label brandLabel = new Label(car.getBrand());
            Label yearsLabel = new Label(Integer.toString(car.getYears()));
            Label modelLabel = new Label(car.getModel());

            // 각 레이블들에 스타일 클래스를 추가한다
            brandLabel.getStyleClass().add("tableLabel");
            yearsLabel.getStyleClass().add("tableLabel");
            modelLabel.getStyleClass().add("tableLabel");

            // 해당 HBox와 각 레이블을 배치시킨다
            carInfoBox.getChildren().addAll(brandLabel, yearsLabel, modelLabel);
            carInfoContainer.getChildren().add(carInfoBox);
        }

    }

}
