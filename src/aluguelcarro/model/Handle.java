package aluguelcarro.model;

import aluguelcarro.controller.Controller;
import javafx.event.ActionEvent;

public interface Handle {
    
    public void handleButtonClicks(ActionEvent mouseEvent);
    public void exitAction(ActionEvent mouseEvent);
    
}
