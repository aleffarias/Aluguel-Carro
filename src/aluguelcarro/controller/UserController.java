package aluguelcarro.controller;

public class UserController {
   private static String currentUser;
   
    public static String getCurrentUser() {
        return currentUser;
    }

    /**
     *
     * @param currentUser
     */
    public static void setCurrentUser(String currentUser) {
        UserController.currentUser = currentUser;
    }
   
   
}
