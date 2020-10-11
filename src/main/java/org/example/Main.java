package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("example.fxml"));
        stage.setTitle("Крестики-нолики");
        stage.setScene(new Scene(root, 600, 400));
        stage.resizableProperty().setValue(false);
        stage.getIcons().add(new Image("file:src/main/resources/TicTacToe.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}