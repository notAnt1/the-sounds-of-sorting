package edu.grinnell.csc207.soundsofsorting.events;

import java.util.List;

/**
 * A <code>SwapEvent</code> logs a swap between two indices of the array.
 */
public class SwapEvent<T> implements SortEvent<T> {
    private int index1;
    private int index2;

    public SwapEvent(int index1, int index2){
        this.index1 = index1;
        this.index2 = index2;
    }

    public void apply(T[] arr){
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public List<Integer> getAffectedIndices() {
        return List.of(index1, index2);
    }
    
    public boolean isEmphasized() {
        return true;
    }
}
