package modules;

import models.Action;
import models.Metric;
import models.Queue;
import models.State;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RL {

    /**
     *
     * @param state
     * @param sojourn
     * @param lifespan
     * @param index 当前任务对应的队列序号
     * @return RTT与失败率
     */
    public double[] calculateFailureRate(State state, int sojourn, int lifespan, int index){
        //Calculate Failure Rate
        return  null;
    };

    /**
     *
     * @param states
     * @param e epsilon-greedy算法
     * @param T 迭代次数
     * @return 度量标准
     */
    public Metric epsilonGreedyAlgorithm(List<State> states, double e, int T){
        //Use Epsilon-Greedy Algorithm
        //计算回报矩阵
        //e.g. 示例
        Map<State, double[]> R = new HashMap<State, double[]>();
        for(State state : states){
            R.put(state, new double[]{
                    calculateImmediateCost(state, Action.Local),
                    calculateImmediateCost(state, Action.AdHoc),
                    calculateImmediateCost(state, Action.Cloudlet)
            });
        }
        return null;
    }

    /**
     *
     * @param states
     * @param t
     * @param T 迭代次数
     * @return 度量标准
     */
    public Metric softMaxAlgorithm(List<State> states, double t, int T){
        //Use Soft-Max Algorithm
        return null;
    }

    /**
     * 根据动作的不同分别计算相应的开销
     * @param action
     * @return
     */
    public double calculateImmediateCost(State state, Action action){
        //3 Types of actions
        switch (action){
            case Local:
                return calculateLocalCost(state);
            case AdHoc:
                return calculateAdHocCost(state);
            case Cloudlet:
                return calculateCloudletCost(state);
            default:
        }
        return 0;
    }

    /**
     *
     * @return 本地执行开销
     */
    public double calculateLocalCost(State state){
        //Calculate Local Cost
        return 0;
    }

    /**
     *
     * @return (点对点)接触网络执行开销
     */
    public double calculateAdHocCost(State state){
        //Calculate AdHoc Cost
        return 0;
    }

    /**
     *
     * @return AP执行开销
     */
    public double calculateCloudletCost(State state){
        //Calculate Cloudlet Cost
        return 0;
    }

    /**
     *
     * @param index 当前任务对应的队列序号
     * @return 当前任务估计RTT
     */
    public double calculateEstimationRTT(int index){
        //Calculate 4 Ts separately
        return 0.0;
    }

    /**
     * 当前任务是否超时
     * @param index
     * @return
     */
    public boolean isOvertime(int index){
        return Queue.getTask(index).lifespan < this.calculateEstimationRTT(index);
    }
}
