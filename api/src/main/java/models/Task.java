package models;

public class Task {
    public int id;
    public int input;
    public int output;
    public int workload;
    public int arrival;
    public double lifespan;
    public double RTT;

    public boolean isFailed(){
        return RTT > lifespan;
    }
}
