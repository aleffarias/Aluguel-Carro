package aluguelcarro.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;

public class SignUpController extends Controller implements Initializable {
    
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
       
