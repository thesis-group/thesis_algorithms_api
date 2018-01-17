package modules;

import models.Result;
import models.State;

import java.util.Map;

public class Scheduling {


    /**
     * 调度方法
     * @param Q
     * @param threshold
     * @param useFTStrategy
     * @return
     */
    //!返回值修改(任务RTT，任务执行地点，成功失败与否，失误率)
    public Result scheduling(Map<State, double[]> Q, double threshold, boolean useFTStrategy){
        //Fault Tolerate Strategy
        if(useFTStrategy){
            //参见算法4
        }else{
            //直接使用学习得到的模型
        }
        return null;
    };
}
