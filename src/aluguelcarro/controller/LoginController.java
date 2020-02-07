package aluguelcarro.controller;

import aluguelcarro.model.Handle;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class LoginController extends Controller implements Initializable, Handle {

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

    
    @Override
    public void initialize(URL location, ResourceBundle rb) {
    }
    
    @FXML
    @Override
     public void handleButtonClicks(ActionEvent mouseEvent) {
         if (mouseEvent.getSource() == buttonSignUp) loadStage(buttonSignUp, "/aluguelcarro/view/SignUp.fxml");
         else if (mouseEvent.getSource() == buttonLogin) loadStage(buttonLogin, "/aluguelcarro/view/Rent.fxml");
         
     }

    @Override
    public void exitAction(ActionEvent mouseEvent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
          
}