package com.example.shoepping;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import java.io.IOException;
import java.util.Objects;

public class login_gcontroller {
    public TextField loginUsername;
    public Label usernameLabel;
    public TextField loginPassword;
    public Label passwordLabel;
    public Text forgotPassword;
    public Button loginButton;
    public ImageView googleLogo;
    public Text createProfile;
    public AnchorPane loginPane;


    public void PasswordRecovery() {
        Parent root;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("password-recovery-view.fxml")));
            change_window cw = new change_window();
            cw.switchPage(root, loginPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void Login() {
    }

    public void GoogleLogin() {
    }

    public void Registration() {
        Parent root;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("registration-view.fxml")));
            change_window cw = new change_window();
            cw.switchPage(root, loginPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
