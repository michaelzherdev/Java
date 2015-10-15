/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author mzherdev
 */
public class RadioButtonDemo extends Application {
    
    Label response;
    
    @Override
    public void start(Stage myStage) {
        myStage.setTitle("Demonstrate Radio Buttons");
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(rootNode, 220,120);
        myStage.setScene(myScene);
        
        response = new Label("");
        
        RadioButton rbTrain = new RadioButton("Train");
        RadioButton rbCar = new RadioButton("Car");
        RadioButton rbPlane = new RadioButton("Airplane");
        
        ToggleGroup tg = new ToggleGroup();
        
        rbTrain.setToggleGroup(tg);
        rbCar.setToggleGroup(tg);
        rbPlane.setToggleGroup(tg);
        
        rbTrain.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                response.setText("Transport selected is a train");
            }
        });
        
        rbCar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                response.setText("Transport selected is a car");
            }
        });
        
        rbPlane.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                response.setText("Transport selected is a airplane");
            }
        });
        
        
  //      tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
  //          public void changed(ObservableValue<? extends Toggle> changed,
  //                  Toggle oldVal, Toggle newVal) {
  //              RadioButton rb = (RadioButton) newVal;
  //              response.setText("Transport selected is a " + rb.getText());
  //         }
  //   });
        
        rbTrain.fire();
  //    rbTrain.setSelected(true);
        
        rootNode.getChildren().addAll(rbCar, rbPlane, rbTrain, response);
        myStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
