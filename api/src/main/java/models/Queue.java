package models;

import java.util.LinkedList;
import java.util.List;

public abstract class Queue {

    public final static int MAX_LENGTH = 10;

    //FCFS
    static LinkedList<Task> queue = new LinkedList<Task>();
    public static int ptr = -1;

    public static void initQueue(List<Task> initial){
        queue.addAll(initial);
    }

    public static int getLength(){
        return queue.size() - ptr - 1;
    }

    public static void addTask(Task task){
        if(!isFull()) queue.add(task);
    }

    public static Task getTask(int i){
        return queue.get(i);
    }

    public static boolean isFull(){
        return getLength() >= MAX_LENGTH;
    }

    public static Task next(){
        if(++ptr < queue.size()){
            return queue.get(ptr);
        }

        ptr = -1;
        return null;
    }

    public static double getRTT(int index){
        return index < 0 ? 0 : queue.get(index).RTT;
    }

    public static double getCumulativeRTT(int length){
        double RTT = 0;
        for (int i = 0; i<length; i++){
            RTT += getRTT(i);
        }

        return RTT;
    }

    /**
     * 泊松过程模拟任务到达
     * @return
     */
    public static List<Task> taskArrived(){
        //泊松过程
        return null;
    }

    public static boolean hasNext(){
        return ptr < queue.size() - 1;
    }

}
