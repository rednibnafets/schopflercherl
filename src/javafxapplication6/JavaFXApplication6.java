/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;
//import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

/**
 * http://docs.oracle.com/javase/8/javafx/scene-graph-tutorial/scenegraph.htm#JFXSG107
 * http://docs.oracle.com/javafx/2/api/javafx/animation/Transition.html
 * 
 * Shapes in ArrayList (not: Nodes)
 * http://stackoverflow.com/questions/15013913/checking-collision-of-shapes-with-javafx
 * 
 * http://sws.bfh.ch/~amrhein/Skripten/Swing/Lesson08.pdf
 * @author stefan
 */
public class JavaFXApplication6 extends Application {
    
    
    
    @Override
    public void start(Stage stage) {

        
        Group root = new Group(); 
        Scene scene = new Scene(root, 500, 500, Color.BLACK); 
        //ArrayList< Rectangle > lr = new ArrayList<>() ;
        // use a Group instead
        Group rectangles_ = new Group();
        
        for (int i = 0 ; i < 100 ; i += 20){
            Rectangle r = new Rectangle(0, i, 10, 10); 
            r.setFill(Color.BLUE) ;
            //lr.add(r) ;
            rectangles_.getChildren().add(r) ;
        }
        
        //for (Rectangle r : lr){
        //    root.getChildren().add(r) ;
        //}
        root.getChildren().add(rectangles_) ;
        
        //TranslateTransition translate =  new TranslateTransition(Duration.millis(2750)); 
        
        
        //for (Node r : rectangles_.getChildren() ){
            //translate.setToX(390);
            //translate.setToX(390);
            //r.translateXProperty(390) ;
            //translate.
            //r.setTranslateX(390);
        //}
        
//        Timeline timeline = new Timeline();
//        for (Node r: rectangles_.getChildren()) {
//            timeline.getKeyFrames().addAll(
//                new KeyFrame(Duration.ZERO, // set start position at 0
//                    new KeyValue(r.translateXProperty(), 0),
//                    new KeyValue(r.translateYProperty(), 0)
//                ),
//                new KeyFrame(new Duration(4000), // set end position at 40s
//                    new KeyValue(r.translateXProperty(), 400),
//                    new KeyValue(r.translateYProperty(), 400)
//                )
//            );
//        }
//        // play 40s of animation
//        timeline.play();           
        
        
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
 
        TranslateTransition translate =  new TranslateTransition(Duration.millis(3750)); 
        translate.setToX(250); 
        //translate.setToX(390);
        translate.setToY(250); 
// 
        //FillTransition fill_ = new FillTransition(Duration.millis(2)); 
        //fill_.setToValue(Color.RED); 
        //fill.setToValue(Color.AQUA);
// 
      RotateTransition rotate = new RotateTransition(Duration.millis(3750)); 
      rotate.setToAngle(90); 
// 
        ScaleTransition scale = new ScaleTransition(Duration.millis(3750)); 
        scale.setToX(2);   // 1: same size as before
        scale.setToY(2); 
//
// 
//        //ParallelTransition transition = new ParallelTransition(r, 
//        //translate, fill, rotate, scale); 
//        ParallelTransition transition = new ParallelTransition(r, 
//        translate, fill, scale);
//        transition.setCycleCount(Timeline.INDEFINITE);
//        //transition.setAutoReverse(true); 
        ParallelTransition transition = new ParallelTransition(rectangles_, translate, rotate, scale) ;
        //transition.setCycleCount(Timeline.INDEFINITE);
        //transition.setAutoReverse(true); 
        transition.play(); 
        //rectangles_.getChildren();
        

        
        //FillTransition ft = new FillTransition(Duration.millis(3000), rectangles_.getChildren(), Color.RED, Color.BLUE);
        //ft.setToValue(Color.RED);
        // stage: param
        stage.setTitle("JavaFX Scene Graph Demo"); 
        stage.setScene(scene); 
        stage.show();        
        
//        for (Node r : rectangles_.getChildren() ){
//            Shape s = (Shape) r ;
//            s.setFill(Color.RED);
//            
//        } 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
