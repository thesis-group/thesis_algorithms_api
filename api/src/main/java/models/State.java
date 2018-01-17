package models;

public class State {

    public int id; //Zone id
    public int nodes; //Average number of nodes in the TCS
    public int index; //Index of current task
    public int length;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        State state = (State) o;

        if (id != state.id) return false;
        if (nodes != state.nodes) return false;
        return index == state.index;
    }

    /**
     * 插值法计算nodes
     * @param points
     */
    public void setNodesByInterpolation(AverageNode[] points){
        //插值法计算nodes，可以考虑调用api
    }
}
