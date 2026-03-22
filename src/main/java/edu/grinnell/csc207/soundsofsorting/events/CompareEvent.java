package edu.grinnell.csc207.soundsofsorting.events;

import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 */
public class CompareEvent<T> implements SortEvent<T> {
    private int index1;
    private int index2; 

    public CompareEvent(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;
    }

    public void apply(T[] arr) {
    }

    public List<Integer> getAffectedIndices() {
        return List.of(index1, index2);
    }

    public boolean isEmphasized() {
        return false;
    }
}
