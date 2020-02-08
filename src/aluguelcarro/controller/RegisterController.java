package aluguelcarro.controller;

import aluguelcarro.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class RegisterController implements Initializable, ControlledScreen {
    
    Controller myController;  
    
    @FXML
    void rentButtonAction(ActionEvent event) {
        myController.setScreen(Main.rentID);
    }
    
    @FXML
    void myProfileButtonAction(ActionEvent event) {
        myController.setScreen(Main.myProfileID);
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
