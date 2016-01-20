/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
//import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;



/**
 * http://docs.oracle.com/javase/8/javafx/scene-graph-tutorial/scenegraph.htm#JFXSG107
 * @author stefan
 */
public class JavaFXApplication6 extends Application {
    
    @Override
    public void start(Stage stage) {
        Group root = new Group(); 
        Scene scene = new Scene(root, 500, 500, Color.BLACK); 
        Rectangle r = new Rectangle(0, 0, 250, 250); 
        r.setFill(Color.BLUE); 
        root.getChildren().add(r); 
 
        TranslateTransition translate = 
        new TranslateTransition(Duration.millis(750)); 
        translate.setToX(390); 
        translate.setToY(390); 
 
        FillTransition fill = new FillTransition(Duration.millis(750)); 
        fill.setToValue(Color.RED); 
 
        RotateTransition rotate = new RotateTransition(Duration.millis(750)); 
        rotate.setToAngle(360); 
 
        ScaleTransition scale = new ScaleTransition(Duration.millis(750)); 
        scale.setToX(0.1); 
        scale.setToY(0.1); 
 
        ParallelTransition transition = new ParallelTransition(r, 
        translate, fill, rotate, scale); 
        transition.setCycleCount(Timeline.INDEFINITE);
        transition.setAutoReverse(true); 
        transition.play(); 
 
        // stage: param
        stage.setTitle("JavaFX Scene Graph Demo"); 
        stage.setScene(scene); 
        stage.show(); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
