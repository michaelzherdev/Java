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
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author mzherdev
 */
public class JavaFXEventDemo extends Application {
    
    Label response;
    
    @Override
    public void start(Stage myStage) {
        myStage.setTitle("Demonstrate JavaFX Buttons and Events");
        
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(rootNode, 300, 100);
        myStage.setScene(scene);
        
        response = new Label("Push a button");
        
        Button btnA = new Button("Alpha");
        Button btnB = new Button("Beta");
        
        btnA.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Alpha was pressed");
            }
        });
        
        btnB.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
              response.setText("Beta was pressed");
            }
        });
        
        rootNode.getChildren().addAll(btnA, btnB, response);
        
        myStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
