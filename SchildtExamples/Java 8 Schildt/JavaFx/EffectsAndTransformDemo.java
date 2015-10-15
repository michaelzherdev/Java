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
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

/**
 *
 * @author mzherdev
 */
public class EffectsAndTransformDemo extends Application {
    double angle = 0.0 ;
    double glowVal = 0.0;
           boolean shadow = false;
           double scaleFactor = 1.0;
           
           Glow glow = new Glow(0.0);
           InnerShadow innerShadow = new InnerShadow(10.0, Color.RED);
           Rotate rotate = new Rotate();
           Scale scale = new Scale(scaleFactor, scaleFactor);
           
           Button btnRotate = new Button("Rotate");
           Button btnGlow = new Button("Glow");
           Button btnShadow = new Button("Shadow off");
           Button btnScale = new Button("Scale");
           
           
    @Override
    public void start(Stage myStage) {
        myStage.setTitle("Demonstrate Radio Buttons");
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(rootNode, 300,100);
        myStage.setScene(myScene);
        
        btnGlow.setEffect(glow);
        btnRotate.getTransforms().add(rotate);
        btnScale.getTransforms().add(scale);
        
        btnRotate.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                angle += 30;
                rotate.setAngle(angle);
                rotate.setPivotX(btnRotate.getWidth()/2);
                rotate.setPivotY(btnRotate.getWidth()/2);
            }
        });
        
        btnScale.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                scaleFactor += 0.1;
                if(scaleFactor > 1.0) scaleFactor = 0.4;
                scale.setX(scaleFactor);
                scale.setY(scaleFactor);
            }
        });
        
        btnGlow.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                glowVal += 0.1;
                if(glowVal > 1.0) glowVal = 0.0;
                glow.setLevel(glowVal);
            }
        });
        
        btnShadow.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                shadow = !shadow;
                if(shadow){
                    btnShadow.setEffect(innerShadow);
                    btnShadow.setText("Shadow on");
                } else {
                    btnShadow.setEffect(null);
                    btnShadow.setText("Shadow off");
                }
            }
        });
        
        rootNode.getChildren().addAll(btnGlow, btnRotate, btnScale, btnShadow);
        myStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
