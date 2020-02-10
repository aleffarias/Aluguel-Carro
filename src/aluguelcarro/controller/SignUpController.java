package aluguelcarro.controller;

import aluguelcarro.Main;
import aluguelcarro.model.bean.Client;
import aluguelcarro.model.dao.ClientDAO;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;

public class SignUpController extends Controller implements Initializable, ControlledScreen {
    
    Controller myController;
    
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
    void signUpButtonAction(ActionEvent event) {
        Client client = new Client();
        ClientDAO dao = new ClientDAO();
        
        client.setName(username.getText());
        client.setEmail(email.getText());
        client.setGender(getGender());
        client.setPassword(password.getText());
        
        dao.create(client);
        
        // clean the screen
        username.setText("");
        email.setText("");
        password.setText("");
        passwordConfirm.setText("");
        
        myController.setScreen(Main.mainID);    
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
       
