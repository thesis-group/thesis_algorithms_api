package models;

import java.util.Map;


public class Metric {

    public Map<State, State[]> T;

    public Map<State, double[]> Q;

    public Metric(Map<State, State[]> T, Map<State, double[]> Q){
        this.T = T;
        this.Q = Q;
    }
}
