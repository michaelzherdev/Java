/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author mzherdev
 */
public class ToggleButtonDemo extends Application {
    ToggleButton tb;
    Label response;
    
    @Override
    public void start(Stage myStage) {
        myStage.setTitle("Demonstrate toggle button");
        
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 220, 120);
        
        myStage.setScene(myScene);
        response = new Label("Push the button");
        tb = new ToggleButton("On/Off");
        
        tb.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               if(tb.isSelected()){
                    response.setText("Button is ON");
               } else {
                    response.setText("Button is OFF");
               }
            }
        });
        rootNode.getChildren().addAll(tb, response);
        myStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
