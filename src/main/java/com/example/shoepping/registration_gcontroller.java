package com.example.shoepping;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class registration_gcontroller {
    public AnchorPane registrationPane;
    public TextField registrationUsername;
    public TextField registrationPassword;
    public TextField registrationRepassword;
    public Button signupButton;
    public ImageView backButton;
    public TextField securityQuestion;

    public void GoBack() {
        Parent root;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login-view.fxml")));
            change_window cw = new change_window();
            cw.switchPage(root, registrationPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void Registration() {
    }
}
