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
            final DoubleProperty opacity = opacityProperty();
            
            if (!getChildren().isEmpty()) { // more than pnde screen
                Timeline fade = new Timeline (
                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 1.0)),
                        new KeyFrame(new Duration(1000), new EventHandler<ActionEvent>() {
                            
                    @Override
                    public void handle(ActionEvent t) {
                        getChildren().remove(0);
                        getChildren().add(0, screens.get(name));
                        
                        Timeline fadeIn = new Timeline(
                            new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                            new KeyFrame(new Duration(800), new KeyValue(opacity, 1.0)));
                        fadeIn.play();
                    }   
                 }, new KeyValue(opacity, 0.0)));
                fade.play();
                
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
    
    
    
    
    
    
    
    
    /*public void loadStage(JFXButton buttonEvent, String fxml) {
        try {
      
            // Hide current window
            buttonEvent.getScene().getWindow().hide();
            
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
        }
     }
*/
}
