package edu.guilford;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Launcher extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();

        ChessBoard board = new ChessBoard();
        root.getChildren().add(board);
        scene = new Scene(root, 600, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}