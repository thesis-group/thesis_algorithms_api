package models;

public class Strategy {
    public State state;
    public Action action;
    public boolean success;
    public double failureRate;

    public Strategy(State state, Action action, boolean success, double failureRate) {
        this.state = state;
        this.action = action;
        this.success = success;
        this.failureRate = failureRate;
    }
}
