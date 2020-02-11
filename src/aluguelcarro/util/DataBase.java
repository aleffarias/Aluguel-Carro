package aluguelcarro.util;

import aluguelcarro.model.bean.Car;
import aluguelcarro.model.bean.Client;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DataBase {
    private static DataBase uniqueInstance;
    private DataBase() {	}

    private static ArrayList<Client> users = new ArrayList<Client>();
    private static ArrayList<Car> cars = new ArrayList<Car>();

    // Singleton
    public static synchronized DataBase getInstance() {
            if (uniqueInstance == null) 
                    uniqueInstance = new DataBase();
            
            return uniqueInstance;
    }
    
    public boolean authenticationUser(String username, String password){
        
        if (users.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não há usuários cadastrados.");
                return false;
        }

        for (int i=0; i < users.size(); i++) {
                if (users.get(i).getName().equals(username) && (users.get(i).getPassword().equals(password))) {
                    break;
                } else {
                    return false;
                }
        }
        return true;
    }
    
    public int searchUser(String username){ 
        int i;
        
        if (users.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não há usuários cadastrados.");
                return -1;
        }

        for (i=0; i < users.size(); i++) {
                if (users.get(i).getName().equals(username)) {
                    break;
                }
        }
        return i;
    }
    
    public ArrayList<Client> getUsers() {
        return users;
    }

    public void setUsers(Client user) {
        this.users.add(user);
    }
    
    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setUsers(Car car) {
        this.cars.add(car);
    }
        
}
