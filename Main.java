package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class Main extends Application {
    @FXML
    Canvas canvas1;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("PLC Editor");
        primaryStage.setScene(new Scene(root, 850, 650));
        primaryStage.show();


    }

    public static void main(String[] args) {

        launch(args);

    }
}
