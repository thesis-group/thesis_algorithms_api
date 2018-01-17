package modules;

import models.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RL {

    public final static int MAX_EXEC = 10;
    public Weight localWeight;
    public Weight adHocWeight;
    public Weight cloudletWeight;

    public RL(Weight localWeight, Weight adHocWeight, Weight cloudletWeight){
        this.localWeight = localWeight;
        this.adHocWeight = adHocWeight;
        this.cloudletWeight = cloudletWeight;
    }

    /**
     *
     * @param state
     * @param sojourn
     * @return RTT与失败率
     */
    public double[] calculateFailureRate(State state, int sojourn, double p){
        //Calculate Failure Rate
        //* Calculate s(根据环境)
        return  null;
    };

    /**
     *
     * @param e epsilon-greedy算法
     * @param T 迭代次数
     * @return 度量标准
     */
    public Metric epsilonGreedyAlgorithm(double e, int T){
        //Use Epsilon-Greedy Algorithm

        //初始化状态
        List<State> states = initiateStates();

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
        //剩余算法部分
        return null;
    }

    /**
     *
     * @param t
     * @param T 迭代次数
     * @return 度量标准
     */
    public Metric softMaxAlgorithm(double t, int T){
        //Use Soft-Max Algorithm

        //初始化状态
        List<State> states = initiateStates();

        //计算回报矩阵
        //e.g. 示例同epsilon-greedy
        //剩余算法部分(需要实现有概率的随机选择)
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
        //使用本地执行权重localWeight
        return 0;
    }

    /**
     *
     * @return (点对点)接触网络执行开销
     * 可能出现不能选择点对点网络执行的情况，此时可以置开销为负值，但在强化学习算法中需要添加额外判断
     */
    public double calculateAdHocCost(State state){
        //Calculate AdHoc Cost
        //使用接触网络执行权重adHocWeight
        //需要根据拥塞程度sigma计算rch
        return 0;
    }

    /**
     *
     * @return AP执行开销
     */
    public double calculateCloudletCost(State state){
        //Calculate Cloudlet Cost
        //使用AP执行权重cloudletWeight;
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
     *
     * @param task 当前任务
     * @return 当前任务估计RTT
     */
    public double calculateEstimationRTT(Task task){
        //Calculate 4 Ts separately
        return 0.0;
    }

    /**
     * 当前任务是否超时
     * @param index
     * @param n 当前执行次数
     * @return
     */
    public boolean isOvertime(int index, int n){
        if(n >= MAX_EXEC) return false;
        return Queue.getTask(index).lifespan < this.calculateEstimationRTT(index);
    }

    /**
     * 当前任务是否超时
     * @param task
     * @param n
     * @return
     */
    public boolean isOvertime(Task task, int n){
        if(n >= MAX_EXEC) return false;
        return task.lifespan < this.calculateEstimationRTT(task);
    }

    /**
     * 计算接触概率
     * @return
     */
    public static double calculateContactRate(MDSet mdSet){
        //Calculate Contact Rate
        return 0.0;
    }

    /**
     * 状态初始化
     * @return
     */
    public List<State> initiateStates(){
        //Init States according to states(初始队列信息给定，根据队列初始化状态)
        return null;
    }
}
