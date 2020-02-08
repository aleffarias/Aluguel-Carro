package aluguelcarro.controller;

import aluguelcarro.Main;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;

public class SignUpController extends Controller implements Initializable, ControlledScreen {
    
    Controller myController;
    
    @FXML
    private JFXPasswordField password;

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
    public void exitButtonAction(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    void signUpButtonAction(ActionEvent event) {
        myController.setScreen(Main.rentID);
    }

    @FXML
    void loginButtonAction(ActionEvent event) {
        myController.setScreen(Main.mainID);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @Override
    public void setScreenParent(Controller screenParent) {
        myController = screenParent;
    }

}
       
