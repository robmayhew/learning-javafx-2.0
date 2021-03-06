package first.component;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstComponent extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("First Component");
        Clock arrow = new Clock();        
        StackPane root = new StackPane();
        root.getChildren().add(arrow);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
