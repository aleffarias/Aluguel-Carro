package aluguelcarro.controller;

import aluguelcarro.Main;
import aluguelcarro.model.dao.LoginDAO;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;

public class LoginController extends Controller implements Initializable, ControlledScreen {

    Controller myController;
    
    @FXML
    private JFXTextField username;
    
    @FXML
    private JFXPasswordField password;
   
    @FXML
    @Override
    public void exitButtonAction(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    void loginButtonAction(ActionEvent event) {
        
        LoginDAO login = new LoginDAO();
        
        if (login.checkLogin(username.getText(), password.getText())) {
            myController.setScreen(Main.rentID);
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!");
        }     
        
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