package aluguelcarro.controller;

import aluguelcarro.Main;
import aluguelcarro.model.bean.Client;
import aluguelcarro.util.DataBase;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;

public class SignUpController extends Controller implements Initializable, ControlledScreen {
    
    Controller myController;
    
    private DataBase dataBase;
    
    @FXML
    private JFXTextField username;
    
    @FXML
    private JFXTextField email;
    
    @FXML
    private JFXRadioButton male;
      
    @FXML
    private JFXCheckBox checkTerms; // Add verification
    
    @FXML
    private JFXPasswordField password;
    
    @FXML
    private JFXPasswordField passwordConfirm;
    
    @FXML
    @Override
    public void exitButtonAction(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    void signUpButtonAction(ActionEvent event) throws IOException {
        
        Client user = new Client(username.getText(), email.getText(), getGender(), password.getText());
        
        dataBase = DataBase.getInstance();
        dataBase.setUsers(user);
        
        
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
        myController.setScreen(Main.mainID);    

        // clean the screen
        username.setText("");
        email.setText("");
        password.setText("");
        passwordConfirm.setText("");   
        
    }

    @FXML
    void loginButtonAction(ActionEvent event) {
        myController.setScreen(Main.mainID);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
    
    @Override
    public void setScreenParent(Controller screenParent) {
        myController = screenParent;
    }
    
    public String getGender(){
    
       String gender = "";
        
       if (male.isSelected()) {
            gender = "Homem";
       } else {
           gender = "Mulher";
       }    
       
        return gender;
    }

}
       
