package com.example.shoepping;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class password_recovery_gcontroller {

    public TextField recoveryUsername;

    public Button recoverButton;

    public ImageView backButton;
    public AnchorPane recoveryPane;
    public TextField recoveryColour;

    public void GoBack (){
        Parent root;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login-view.fxml")));
            change_window cw = new change_window();
            cw.switchPage(root, recoveryPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void SendPassword() {
    }
}
