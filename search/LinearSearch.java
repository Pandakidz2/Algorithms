package search;

public class LinearSearch{

    /**
     * Returns an integer value of where the element is located in the array.
     * Will return a value of -1 if the element is not found.
     * @param array any array of objects
     * @param value any object. If a user defined object, must have the same reference value.
     * @return the index value for the specified element. 
     */
    public static int search(Object[] array, Object value){

        for(int i=0; i<array.length; i++){
            Object element = array[i];

            if(element == value) return i;
        }
        
        return -1;
    }


}