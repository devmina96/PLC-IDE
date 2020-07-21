package sample;

import javafx.scene.shape.Line;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.util.*;
import javafx.scene.control.ChoiceBox;

public class AlertBox {


    public static String display(String title, String message) {
        Stage window = new Stage();

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        window.setMinHeight(100);

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().add("--| |--");
        choiceBox.getItems().add("--|/|--");
        choiceBox.getItems().addAll("---( )", "---(/)");

        //Set a default value
        choiceBox.setValue("--| |--");

        choiceBox.getSelectionModel().selectedItemProperty().addListener( (v, oldValue, newValue) -> System.out.println(newValue) );

        TextField text = new TextField();
        Button OKButton = new Button("OK");
        OKButton.setOnAction(e -> {
            String value = text.getText();
            window.close();
            System.out.println(value);


        });

        HBox layout = new HBox(10);
        layout.getChildren().addAll(choiceBox,text, OKButton);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();




        return text.getText();
    }

}