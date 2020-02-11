package aluguelcarro.controller;

import aluguelcarro.Main;
import aluguelcarro.model.bean.Client;
import aluguelcarro.util.DataBase;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class MyProfileController extends Controller implements Initializable, ControlledScreen {

    Controller myController;
    
    private DataBase dataBase = DataBase.getInstance();
    private ArrayList<Client> users = dataBase.getUsers(); 
    
    @FXML
    private Label username;
            
    @FXML
    private Label email;
    
    @FXML
    private TextArea carArea;
    
    @FXML
    void rentButtonAction(ActionEvent event) {
        myController.setScreen(Main.rentID);
    }
    
    @FXML
    void registerButtonAction(ActionEvent event) {
        myController.setScreen(Main.registerID);
    }
    
    @FXML
    void updateButtonAction(ActionEvent event) {
//        for (int i=0; i < users.size(); i++) {
//            carArea.setText(users.get(i).getName());
//        }
    }
    
    @FXML
    @Override
    public void exitButtonAction(ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void setScreenParent(Controller screenParent) {
        myController = screenParent;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        username.setText("Alef");
        email.setText("alef@email.com");
    }
    
}
