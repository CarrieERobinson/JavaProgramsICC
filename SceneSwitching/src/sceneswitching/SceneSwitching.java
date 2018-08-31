/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sceneswitching;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneSwitching extends Application{
    
    Stage window; //The stage is the window, var name for simplicity
    Scene scene1, scene2; //The scene is the contents, should have more specific names later on
    
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        window = primaryStage; //allows to use simple stage name
        
        Label label1 = new  Label("Welcome to graphics 1");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e-> window.setScene(scene2));
        
        //layout 1 - children are laid out in a vertical column
        VBox layout1 = new VBox(20); //20 is space b/t elements
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);
        
        //button 2
        Button button2 = new Button("Go to scene 1");
        button2.setOnAction(e-> window.setScene(scene1));
        
        //layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);
        
        window.setScene(scene1);
        window.setTitle("Cool Title");
        window.show();
    }
    
    
}
