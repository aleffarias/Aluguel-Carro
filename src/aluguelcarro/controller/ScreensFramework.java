package aluguelcarro.controller;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreensFramework extends Application {
    
    public static String mainID = "main";
    public static String mainFile = "/aluguelcarro/view/LoginMain.fxml";
    public static String signUpID = "signUpScreen";
    public static String signUpFile = "/aluguelcarro/view/SignUp.fxml";
    public static String rentID = "rentScreen";
    public static String rentFile = "/aluguelcarro/view/Rent.fxml";
    public static String registerID = "registerScreen";
    public static String registerFile = "/aluguelcarro/view/Register.fxml";
    public static String myProfileID = "myProfileScreen";
    public static String myProfileFile = "/aluguelcarro/view/MyProfile.fxml";
    

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Controller mainContainer = new Controller();
        mainContainer.loadScreen(ScreensFramework.mainID, ScreensFramework.mainFile);
        //mainContainer.loadScreen(ScreensFramework.signUpID, ScreensFramework.signUpFile);
        //mainContainer.loadScreen(ScreensFramework.rentID, ScreensFramework.rentFile);
        //mainContainer.loadScreen(ScreensFramework.registerID, ScreensFramework.registerFile);
        //mainContainer.loadScreen(ScreensFramework.myProfileID, ScreensFramework.myProfileFile);
        
        mainContainer.setScreen(ScreensFramework.mainID);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene (root);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
     public static void main(String[] args) {
        launch(args);
    }
    
}
