package aluguelcarro;

import aluguelcarro.controller.Controller;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    
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
        mainContainer.loadScreen(Main.mainID, Main.mainFile);
        mainContainer.loadScreen(Main.signUpID, Main.signUpFile);
        mainContainer.loadScreen(Main.rentID, Main .rentFile);
        mainContainer.loadScreen(Main.registerID, Main.registerFile);
        mainContainer.loadScreen(Main.myProfileID, Main.myProfileFile);
        
        mainContainer.setScreen(Main.mainID);
        
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
