package HomeWork4;


public class DataContainer <T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add (T item){
        if (item == null){
            return -1;
        }
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null){
                return i;
            }
        }
        int freeIndex = this.data.length - 1;
        this.data [freeIndex] = item;
        return freeIndex;
    }
    public T get (int index){
        if (index > this.data.length || index < 0) {
            return null;
        }
        return this.data [index];
    }
    public T[] getItems(){
        return this.data;
    }
    public boolean delete (int index){
        if (index > this.data.length || index < 0) {
            return false;
        } if (index == this.data.length - 1){
            return true;
        }
        for (int i = index; i < this.data.length - 1; i++) {
            this.data[i] = this.data [i+1];
        } return true;
    }


}
