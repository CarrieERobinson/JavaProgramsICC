/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplewindows;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
    
    public static void display(String title, String msg)
    {
        Stage window = new Stage();
        
        //cant click off window, have to close first
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        
        Label label = new Label();
        label.setText(msg);
        
        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> window.close());
        
        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        //must close window befor click off
        window.showAndWait();
        
    }
    
}
