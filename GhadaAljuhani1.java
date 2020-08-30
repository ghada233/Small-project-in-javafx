/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghadaaljuhani1;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class GhadaAljuhani1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //creat grid pane
       GridPane pane=new GridPane();
       //creat image
      Image image=new Image("image/m.png");
      //disply image 
     pane.getChildren().add(new ImageView(image));
      pane.setAlignment(Pos.TOP_CENTER);
      
      //some note in secen 
      Text text =new Text ("Welcome in Ghada blogest \n");
      text.setFont(Font.font("", FontWeight.BLACK, 50));
      text.setFill(Color.PURPLE);
      text.setTextAlignment(TextAlignment.JUSTIFY);
      pane.add(text, 0, 1);
      
      
       Text text2 =new Text ("Hello Evrebody " +
      "I am a student, Ghada Al-Juhani"
               + "I want to share with you"
         + "  a portion of the things that. ");
      text2.setFont(Font.font("", FontWeight.BLACK, 20));
      text2.setFill(Color.PINK);
      text2.setTextAlignment(TextAlignment.JUSTIFY);
      pane.add(text2, 0, 2);
      
      
      
      Text text3 =new Text (" I"
     + " learned through my studies in the field of"
     + "  engineering and computer science"
     + "  especially programming.");
      text3.setFont(Font.font("", FontWeight.BLACK, 20));
      text3.setFill(Color.PINK);
      text3.setTextAlignment(TextAlignment.JUSTIFY);
      pane.add(text3, 0, 3);
      
      
      
         Text text4 =new Text ("First, programming depends"
     + "  on thinking and planning"
     + "  to present things in a way that is more effective "
     + " and easier for the user");
      text4.setFont(Font.font("", FontWeight.BLACK, 20));
      text4.setFill(Color.GOLDENROD);
      text4.setTextAlignment(TextAlignment.JUSTIFY);
      pane.add(text4, 0, 4);
       
      
      
       Text text5 =new Text ("Second, we should design the program"
       + "  to serve everyone in a good way, and to clarify to"
       + "  the user every step through messages\n");
      text5.setFont(Font.font("", FontWeight.BLACK, 20));
      text5.setFill(Color.GOLDENROD);
      text5.setTextAlignment(TextAlignment.JUSTIFY);
      pane.add(text5, 0, 5);
      
      
      
       Text text6 =new Text ("Now I well Share withe you a programing"
       + "  we are do when we stady in java 2"
     +  " it is simple calculator  ");
      text6.setFont(Font.font("", FontWeight.BLACK, 20));
      text6.setFill(Color.PLUM);
      text6.setTextAlignment(TextAlignment.JUSTIFY);
      pane.add(text6, 0, 6);
      
     //to simple caclutor to show people how programin is fun 
     
     pane.setPadding(new Insets(30.5,30.5,30.5,30.5));
     pane.setHgap(5.5);
     pane.setVgap(5.5);
     Label l1=new Label("Enter Number 1");
     Label l2=new Label("Enter Number 2");
     Label l3=new Label("Result");
     l1.setTextFill(Color.PURPLE);
     l2.setTextFill(Color.PURPLE);
     l3.setTextFill(Color.PINK);
     l1.setFont(Font.font("", FontWeight.EXTRA_BOLD, 18));
     l2.setFont(Font.font("", FontWeight.EXTRA_BOLD, 18));
     l3.setFont(Font.font("", FontWeight.EXTRA_BOLD, 18));
     l1.setAlignment(Pos.CENTER);
     l2.setAlignment(Pos.CENTER);
     l3.setAlignment(Pos.CENTER);  
     pane.add(l1, 1, 6);
     pane.add(l2, 1, 7);
     pane.add(l3, 1, 8);
    
     
     final TextField t1 = new TextField("");
     final TextField t2 = new TextField("");
     final TextField t3 = new TextField("");
     t1.setPrefSize(70, 30);
     t2.setPrefSize(70, 30);
     t3.setPrefSize(70, 30);
     t1.setAlignment(Pos.CENTER);
     t2.setAlignment(Pos.CENTER);
     t3.setAlignment(Pos.CENTER);
     pane.add(t1,5,6);
     pane.add(t2,5,7);
     pane.add(t3,5,8);
   
     //button fo opration  
     Button add = new Button("+");
     Button sub= new Button("-");
     Button mult = new Button("*");
     Button div = new Button("/");
     add.setTextFill(Color.PURPLE);
     sub.setTextFill(Color.PURPLE);
     mult.setTextFill(Color.PURPLE);
     div.setTextFill(Color.PURPLE);
     add.setStyle("fx-background-color:pink");
     add.setFont(Font.font("", FontWeight.NORMAL, 18));
     sub.setFont(Font.font("", FontWeight.NORMAL, 18));
     mult.setFont(Font.font("", FontWeight.NORMAL, 18));
     div.setFont(Font.font("", FontWeight.NORMAL, 18));
   
    
    //Anonaymys 
    //add
    add.setOnAction(
    new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
       
     double result= Double.parseDouble( t1.getText())+Double.parseDouble( t2.getText());
     t3.setText(String .valueOf(result));
  }   
    }      
    );
    //sub
     sub.setOnAction(
    new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
      
     double result= Double.parseDouble( t1.getText())-Double.parseDouble( t2.getText());
     t3.setText(String .valueOf(result));
  }   
    }      
    );
    //mult
     mult.setOnAction(
    new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
      
     double result= Double.parseDouble( t1.getText())*Double.parseDouble( t2.getText());
     t3.setText(String .valueOf(result));
  }   
    }      
    );
    //div
    div.setOnAction(
    new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
      
     double result= Double.parseDouble( t1.getText())/Double.parseDouble( t2.getText());
     t3.setText(String .valueOf(result));
  }   
    }      
    );
    
     HBox box=new HBox(20);
     box.getChildren().addAll(add,sub,mult,div);
     box.setAlignment(Pos.CENTER);
     pane.add(box, 1, 9);
     
     
     
     //class for shape
     Circle circle=new Circle();
     circle.setCenterX(10);
     circle.setCenterY(10);
     circle.setRadius(10);
    
     circle.setFill(Color.PURPLE);
     pane.add(circle, 0, 9);
     
     
     
      Text text7 =new Text (" \tif you want Know more about how we do it opens java book and study hard and you will be perfect ");
      text7.setFont(Font.font("", FontWeight.BLACK, 20));
      text7.setFill(Color.PURPLE);
      text7.setTextAlignment(TextAlignment.JUSTIFY);
      pane.add(text7, 0, 9);
      
      
      
      
      
       
       
     Scene scene =new Scene(pane,1700,990);
     primaryStage.setTitle("Ghada Aljuhani ");
     primaryStage.setScene(scene);
     primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
