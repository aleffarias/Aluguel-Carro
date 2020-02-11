package aluguelcarro.controller;

import aluguelcarro.Main;
import aluguelcarro.model.bean.Car;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class RegisterController extends Controller implements Initializable, ControlledScreen {
    
    Controller myController;  
    
    @FXML
    private JFXToggleButton ac;

    @FXML
    private JFXToggleButton automaticTransmission;

    @FXML
    private JFXTextField year;

    @FXML
    private JFXTextField capacity;

    @FXML
    private JFXRadioButton door2;

    @FXML
    private JFXRadioButton door4;

    @FXML
    private JFXTextField price;

    @FXML
    private JFXTextField model;

    @FXML
    private JFXRadioButton truck1;
    
    @FXML
    private JFXRadioButton truck3;

    @FXML
    private JFXRadioButton truck2;

    @FXML
    private JFXTextField brand;

    
    @FXML
    void rentButtonAction(ActionEvent event) {
        myController.setScreen(Main.rentID);
    }
    
    @FXML
    void myProfileButtonAction(ActionEvent event) {
        myController.setScreen(Main.myProfileID);
    }
    
    @FXML
    void registerButtonAction(ActionEvent event) {
//        Car car = new Car(brand.getText(), model.getText(), year.getText(), capacity.getText(), getDoors(), getTruck(), 
//                automaticTransmission.isSelected(), ac.isSelected(), price.getText(), "Alef");
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
    
    public int getDoors() {
       int doors;
        
       if (door2.isSelected()) {
            doors = 2;
       } else {
           doors = 4;
       }    
       
        return doors;
    }
    
    public String getTruck() {
       String truck = "";
        
       if (truck1.isSelected()) {
            truck = "Mala Pequena";
       } else if (truck2.isSelected()){
           truck = "Mala Média";
       } else {
           truck = "Mala Grande";
       }    
       
        return truck;
    }
    
}
