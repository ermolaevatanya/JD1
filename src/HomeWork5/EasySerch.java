package HomeWork5;

public class EasySerch implements ISearchEngine{
    public long search(String text, String word) {
        long counter = 0;
        word = " " + word + " ";
        int index = -1;
        do {
            index = text.indexOf(word, index+1);
            if(index != -1){
                counter++;
            }
        } while (index != -1);
        return counter;
    }

}
