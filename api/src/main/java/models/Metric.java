package models;

import java.util.Map;


public class Metric {

    public Map<State, State[]> T;

    public Map<State, double[]> Q;

    public double[] RTTs;   //每一个任务对应状态的预估RTT

    public Metric(Map<State, State[]> T, Map<State, double[]> Q, double[] RTTs){
        this.T = T;
        this.Q = Q;
        this.RTTs = RTTs;
    }
}
