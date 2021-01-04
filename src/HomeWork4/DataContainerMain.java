package HomeWork4;

public class DataContainerMain {
    public static void main(String[] args) {
        int item = 10;
        DataContainer<Integer> container = new DataContainer<>(new Integer[item]);
        for (int i = 0; i < item; i++) {
            container.add(i);
        }
        System.out.println(container.toString());
    }
}
