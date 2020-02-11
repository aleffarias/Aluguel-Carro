package aluguelcarro.controller;

import aluguelcarro.Main;
import aluguelcarro.model.bean.Client;
import aluguelcarro.util.DataBase;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;

public class LoginController extends Controller implements Initializable, ControlledScreen {

    Controller myController;
    
    private DataBase dataBase = DataBase.getInstance();
    private ArrayList<Client> users = dataBase.getUsers();
    
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
        
        if (dataBase.authenticationUser(username.getText(), password.getText()) == true) {
            
            UserController.setCurrentUser(username.getText());
            
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