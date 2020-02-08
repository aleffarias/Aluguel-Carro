package aluguelcarro.controller;

import aluguelcarro.Main;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class LoginController extends Controller implements Initializable, ControlledScreen {

    Controller myController;
    
    @FXML
    private JFXTextField username;
    
    @FXML
    private JFXPasswordField password;
    
    @FXML
    private JFXButton buttonSignUp;

    @FXML
    private JFXButton buttonLogin;

    @FXML
    private JFXButton ButtonForgotPassword;
    
    @FXML
    @Override
    public void exitButtonAction(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    void loginButtonAction(ActionEvent event) {
        // Add verification
        myController.setScreen(Main.rentID);
    }

    @FXML
    void signUpButtonAction(ActionEvent event) {
        myController.setScreen(Main.signUpID);
    }

    @Override
    public void setScreenParent(Controller screenParent) {
        myController = screenParent;
    }
    
    @Override
    public void initialize(URL location, ResourceBundle rb) {
    }
                 
}