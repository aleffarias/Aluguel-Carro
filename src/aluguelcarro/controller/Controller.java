package aluguelcarro.controller;

import java.io.IOException;
import java.util.HashMap;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class Controller extends StackPane {

   private HashMap<String, Node> screens = new HashMap<>();
   
    public Controller() {
        super();
    }
    
    public void addScreen(String name, Node screen){
        screens.put(name, screen);
    }
    
    public Node getScreen(String name) {
        return screens.get(name);
    }
    
    public boolean loadScreen(String name, String resource) {
        try {
           
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource(resource));
            Parent loadScreen = (Parent) myLoader.load();
            ControlledScreen myScreenController = (ControlledScreen) myLoader.getController();
            myScreenController.setScreenParent(this);
            addScreen(name, loadScreen);
           
            return true;
            
        } catch (IOException e) {
            System.err.println(e.getMessage());
            
            return false;
        }
    }
    
    public boolean setScreen(final String name) {
        if (screens.get(name) != null) {
            
            if (!getChildren().isEmpty()) { // more than pnde screen
                
                getChildren().remove(0);
                getChildren().add(0, screens.get(name));
      
            } else {
                getChildren().add(screens.get(name));
            }
       
            return true;
            
        } else {
            System.out.println("screen has't been loaded!\n");
            
            return false;
        }
    }
    
    // Remove the screen with the given name from the collection of screens
    public boolean unloadScreen(String name) {
        if (screens.remove(name) == null) {
            System.err.println("Screen didn't exist");
            return false;
        } else {
            return true;
        }
    }
}
