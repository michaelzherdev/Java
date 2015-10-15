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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author mzherdev
 */
public class CheckboxDemo extends Application {
    
    Label response;
    Label allTargets;
    
    String targets = "";
    
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
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
