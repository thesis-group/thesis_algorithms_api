package models;

public class State {

    public int id; //Zone id
    public int nodes; //Average number of nodes
    public int index; //Index of current task

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        State state = (State) o;

        if (id != state.id) return false;
        if (nodes != state.nodes) return false;
        return index == state.index;
    }
}
