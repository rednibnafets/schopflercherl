/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import java.util.ArrayList;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
//import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 * http://docs.oracle.com/javase/8/javafx/scene-graph-tutorial/scenegraph.htm#JFXSG107
 * http://docs.oracle.com/javafx/2/api/javafx/animation/Transition.html
 * @author stefan
 */
public class JavaFXApplication6 extends Application {
    
    
    
    @Override
    public void start(Stage stage) {

        
        Group root = new Group(); 
        Scene scene = new Scene(root, 500, 500, Color.BLACK); 
        ArrayList< Rectangle > lr = new ArrayList<>() ;
        
        for (int i = 0 ; i < 100 ; i += 20){
            Rectangle r = new Rectangle(0, i, 10, 10); 
            r.setFill(Color.BLUE) ;
            lr.add(r) ;
        }
        
        for (Rectangle r : lr){
            root.getChildren().add(r) ;
        }
        
        //double y = 100.0 ;
        //for (double y = 100.0; y < 150.0 ; y = y + 20.0){
          //r1.setY(y);
          //r1.setFill(Color.BLUE); 
          //root.getChildren().add(r1); 

//        Rectangle r2 = new Rectangle(200, 200, 250, 200);           
//          //y += 100.0 ;
//          //r2.setY(y);
//          r2.setFill(Color.RED); 
//          root.getChildren().add(r2);           
        //}
 
        TranslateTransition translate =  new TranslateTransition(Duration.millis(2750)); 
        //translate.setToX(390); 
        translate.setToX(390);
        translate.setToY(390); 
// 
//        FillTransition fill = new FillTransition(Duration.millis(750)); 
//        fill.setToValue(Color.RED); 
// 
//        //RotateTransition rotate = new RotateTransition(Duration.millis(750)); 
//        //rotate.setToAngle(360); 
// 
//        ScaleTransition scale = new ScaleTransition(Duration.millis(750)); 
//        scale.setToX(0.1);   // 1: same size as before
//        scale.setToY(0.1); 
//
// 
//        //ParallelTransition transition = new ParallelTransition(r, 
//        //translate, fill, rotate, scale); 
//        ParallelTransition transition = new ParallelTransition(r, 
//        translate, fill, scale);
//        transition.setCycleCount(Timeline.INDEFINITE);
//        //transition.setAutoReverse(true); 
        ParallelTransition transition = new ParallelTransition(lr.get(0), translate) ;
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
