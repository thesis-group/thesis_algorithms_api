package models;

import java.util.List;
import java.util.Map;

public class Result {
    public double[] RTTs;
    public List<State> strategies;

    public Result(double[] RTTs, List<State> strategies) {
        this.RTTs = RTTs;
        this.strategies = strategies;
    }
}
