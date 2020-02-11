package aluguelcarro.model.bean;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int capacity;
    private int doors;
    private String truck;
    private boolean automaticTransmission;
    private boolean ac;
    private float price;
    private String nameUser;
    
    public Car (String brand, String model, int year, int capacity, int doors,String truck, boolean automaticT, boolean ac, float price, String nameUser){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.capacity = capacity;
        this.doors = doors;
        this.truck = truck;
        this.automaticTransmission = automaticT;
        this.ac = ac;
        this.price = price;
        this.nameUser = nameUser;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getTruck() {
        return truck;
    }

    public void setTruck(String truck) {
        this.truck = truck;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
}