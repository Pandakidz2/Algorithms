import search.LinearSearch;
import search.BinarySearch;

public class Main {
    public static void main(String[] args){
        Integer[] array = new Integer[4];

        array[0] = 3;
        array[3] = 1;

        System.out.println(LinearSearch.search(array, 1));
        
    }

}
