package aluguelcarro.controller;

import aluguelcarro.model.Handle;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;

public class SignUpController extends Controller implements Initializable, Handle {
    
    @FXML
    private JFXButton buttonSignUp;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton buttonLogin;

    @FXML
    private JFXPasswordField passwordConfirm;

    @FXML
    private JFXCheckBox checkTerms;

    @FXML
    private ToggleGroup MaleFemale;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXTextField username;
    
     @FXML
    @Override
     public void handleButtonClicks(ActionEvent mouseEvent) {
         if (mouseEvent.getSource() == buttonSignUp) loadStage(buttonSignUp, "/aluguelcarro/view/Rent.fxml");
         else if (mouseEvent.getSource() == buttonLogin) loadStage(buttonLogin, "/aluguelcarro/view/LoginMain.fxml");
         
     }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @Override
    public void exitAction(ActionEvent mouseEvent) {
        System.exit(0);
    }
        
}
