package HomeWork1;
public class HomeWork4 {
    public static void main(String[] args){
        Boolean sleep = sleepIn (vacation); //???
        System.out.println(sleep);
    }
    public static Boolean sleepIn (boolean weekday, boolean vacation){
        if (!weekday || vacation) {
            return true;
        } else
            return false;
        }}