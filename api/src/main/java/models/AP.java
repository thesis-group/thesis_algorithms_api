package models;

public class AP {
    public double capacity;
    public int mdCount;

    public boolean withCloudlet(){
        return capacity > 0;
    }
}
