package aluguelcarro.controller;

import aluguelcarro.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class MyProfileController implements Initializable, ControlledScreen {

    Controller myController;  
    
    @FXML
    private Label username;
    
    @FXML
    private Label email;
    
    @FXML
    void rentButtonAction(ActionEvent event) {
        myController.setScreen(Main.rentID);
    }
    
    @FXML
    void registerButtonAction(ActionEvent event) {
        myController.setScreen(Main.registerID);
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
        // TODO
    }    
    
}
