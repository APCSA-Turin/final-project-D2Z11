package com.example;

import org.json.JSONObject;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application {
    private final int width = 300;
    private final int height = 250;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Jlox Code Editor");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        TextArea textArea = new TextArea();
        textArea.setPromptText("Enter your message here...");

        StackPane root = new StackPane();
        root.getChildren().add(textArea);
        primaryStage.setScene(new Scene(root, width, height));
        primaryStage.show();

        System.out.println(textArea.getText());
    }
}
