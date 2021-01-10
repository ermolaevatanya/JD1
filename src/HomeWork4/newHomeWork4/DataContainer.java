package HomeWork4.newHomeWork4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T> {
    private T[] data;

    public DataContainer(T[] init) {
        this.data = init;
    }
    public void print(){
        System.out.println(Arrays.toString(this.data));
    }
    public int add (T element){
        int index = findEmptySpace();
        if (index == -1){
            index = this.data.length;
            this.data = Arrays.copyOf(this.data, index +1);
        }
        this.data[index] = element;
        return index;
    }
    private int findEmptySpace(){
        for (int i = 0; i < this.data.length; i++){
            if (this.data[i] == null){
                return i;
            }
        }
        return -1;
    }
    public T get (int index){
        if (index < data.length){
            return data[index];
        } else
            return null;
    }
    public T[] getItems(){
        return data;
    }
    public boolean delete (int index){
        if (index < data.length){
            data[index] = null;
            for (int i = index + 1; i < data.length; i++){
                data[i-1] = data[i];
                data [i] = null;
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }else
            return false;
    }
    public boolean delete (T item){
        for (int i = 0; i < data.length; i++) {
            if (item == data [i]){
                data[i] = null;
                for (int j = i + 1; j < data.length; j++) {
                    data [j - 1] = data[j];
                    data[j] = null;
                }
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            }
        }return false;
    }
    public void sort(Comparator<T> comparator){
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < this.data.length-1; i++) {
                if (comparator.compare(this.data[i], this.data[i + 1]) > 0){
                    swap(this.data, i, i + 1);
                    swap = true;
                }
            }
        } while (swap);
    }
    private static <T> void swap(T[] arr, int from, int to){
        T temp = arr[from];
        arr[from] = arr [to];
        arr[to] = temp;
    }
    public static void sort(DataContainer<? extends Comparable> container){
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < container.data.length-1; i++) {
                if (container.data[i].compareTo(container.data[i + 1]) > 0){
                    swap(container.data, i, i + 1);
                    swap = true;
                }
            }
        } while (swap);
    }


}
