package aluguelcarro.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController implements Initializable{

    @FXML
    private JFXButton buttonSignUp;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton buttonLogin;

    @FXML
    private JFXButton ButtonForgotPassword;

    @FXML
    private JFXTextField username;
    
    @Override
    public void initialize(URL location, ResourceBundle rb) {
    }
    
    @FXML
    public void signUpButtonAction(ActionEvent event) throws IOException {
        buttonLogin.getScene().getWindow().hide();
        
        Stage signUp = new Stage();
        
        Parent root = FXMLLoader.load(getClass().getResource("/view/SignUp.fxml"));
        
        Scene scene = new Scene(root);
        signUp.setScene(scene);
        signUp.show();
        signUp.setResizable(false);
    }
}