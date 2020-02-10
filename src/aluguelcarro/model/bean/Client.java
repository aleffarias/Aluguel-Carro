package aluguelcarro.model.bean;

public class Client {
    private int idClient;
    private String username;
    private String email;
    private String gender;
    private String password;

     public int getId() {
        return idClient;
    }

    public void setId(int id) {
        this.idClient = id;
    }
    
    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

     public void setPassword(String password) {
        this.password = password;
    }    
}
