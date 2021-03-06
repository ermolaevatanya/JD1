package HomeWork4.newHomeWork4;

import static HomeWork4.newHomeWork4.DataContainer.*;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Integer> container = new DataContainer<>(new Integer[5]);
        container.add(5);
        container.add(4);
        container.add(3);
        container.add(2);
        container.add(1);
        container.get(1);
        container.getItems();
        container.delete(3);
        container.delete(null);
        sort(container);
        container.print();
    }
}
