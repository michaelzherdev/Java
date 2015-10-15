/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author mzherdev
 */
public class MenuDemo extends Application {
    
    Label response;
    
    @Override
    public void start(Stage myStage) {
        myStage.setTitle("Demostrate menus");
        BorderPane rootNode = new BorderPane();
       
        Scene myScene = new Scene(rootNode, 300, 300);
        myStage.setScene(myScene);
        
       response = new Label("Menu demo");
       
       MenuBar mb = new MenuBar();
       
       Menu fileMenu = new Menu("File");
       MenuItem open = new MenuItem("Open");
       MenuItem close = new MenuItem("Close");
       MenuItem save = new MenuItem("Save");
       MenuItem exit = new MenuItem("Exit");
       fileMenu.getItems().addAll(open, close, save, new SeparatorMenuItem(),exit);
       
       mb.getMenus().add(fileMenu);
       
       Menu optionsMenu = new Menu("Options");
       Menu colorsMenu = new Menu("Colors");
       MenuItem red = new MenuItem("Red");
       MenuItem green = new MenuItem("Green");
       MenuItem blue = new MenuItem("Blue");
       colorsMenu.getItems().addAll(red, green, blue);
       optionsMenu.getItems().add(colorsMenu);
       
       Menu priorityMenu = new Menu("Priority");
       MenuItem high = new MenuItem("High");
       MenuItem low = new MenuItem("Low");
       priorityMenu.getItems().addAll(high, low);
       optionsMenu.getItems().add(priorityMenu);
       optionsMenu.getItems().add(new SeparatorMenuItem());
       MenuItem reset = new MenuItem("Reset");
       optionsMenu.getItems().add(reset);
       
       mb.getMenus().add(optionsMenu);
       
       Menu helpMenu = new Menu("Help");
       MenuItem about = new MenuItem("About");
       helpMenu.getItems().add(about);
       mb.getMenus().add(helpMenu);
       
       EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               String name = ((MenuItem)event.getTarget()).getText();
               if(name.equals("Exit")) Platform.exit();
               response.setText(name + " selected");
            }
        };
       
       open.setOnAction(MEHandler);
       close.setOnAction(MEHandler);
       save.setOnAction(MEHandler);
       exit.setOnAction(MEHandler);
       red.setOnAction(MEHandler);
       green.setOnAction(MEHandler);
       blue.setOnAction(MEHandler);
       high.setOnAction(MEHandler);
       low.setOnAction(MEHandler);
       reset.setOnAction(MEHandler);
       about.setOnAction(MEHandler);
       
       rootNode.setTop(mb);
       rootNode.setCenter(response);
       
       myStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
