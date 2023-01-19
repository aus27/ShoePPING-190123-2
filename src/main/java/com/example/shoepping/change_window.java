package com.example.shoepping;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import static com.example.shoepping.splash_gcontroller.image;

public class change_window {

    public void switchPage(Parent root, AnchorPane pane){
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);

        //lock dimension of window
        stage.setResizable(false);
        stage.setTitle("ShoePPING");

        //set icon in stage
        stage.getIcons().add(image);
        stage.show();

        pane.getScene().getWindow().hide();

    }
}
