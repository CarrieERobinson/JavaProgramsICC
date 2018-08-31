/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplewindows;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleWindows extends Application{
    
    Stage window; //The stage is the window, var name for simplicity
    Scene scene1, scene2; //The scene is the contents, should have more specific names later on
    
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        window = primaryStage; //allows to use simple stage name
        //close properly
        window.setOnCloseRequest(e -> {
            e.consume(); //prevents event for self handling
            closeProgram();
                });
        
        
        Label label1 = new  Label("Welcome to graphics 1");
        Button button1 = new Button("Open new Window");
        
        
        
        //get info back
        button1.setOnAction(e -> {
            boolean result = ConfirmBox.display("Confirm", "Are you sure?");
            System.out.println(result);
        });
        
        Button closeProg = new Button("Close");
        closeProg.setOnAction(e -> closeProgram());
        
        //layout 1 - children are laid out in a vertical column
        VBox layout1 = new VBox(20); //20 is space b/t elements
        layout1.getChildren().addAll(label1, button1, closeProg);
        scene1 = new Scene(layout1, 300, 250);
        
        
        window.setScene(scene1);
        window.setTitle("Cool Title");
        window.show();
    }
    
    private void closeProgram()
    {
        boolean answer = ConfirmBox.display("Title", "Are you sure?");
        if(answer)
            window.close();
    }
    
    
}
