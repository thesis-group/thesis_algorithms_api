package models;

public class AP {
    public double capacity;
    public int mdCount;
    public double bandwidth;

    public boolean withCloudlet(){
        return capacity > 0;
    }

    public AP(double capacity, int mdCount, double bandwidth) {
        this.capacity = capacity;
        this.mdCount = mdCount;
        this.bandwidth = bandwidth;
    }
}
