package aluguelcarro.controller;

import javafx.event.ActionEvent;

public interface ControlledScreen {
    public void setScreenParent(Controller screenParent);
    public void exitButtonAction(ActionEvent event);
}
