package aluguelcarro.controller;

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
    void signUpButtonAction(ActionEvent event) {
        myController.setScreen(ScreensFramework.mainID);
    }
    
    @Override
    public void initialize(URL location, ResourceBundle rb) {
    }

    @Override
    public void setScreenParent(Controller screenParent) {
        myController = screenParent;
    }
                 
}