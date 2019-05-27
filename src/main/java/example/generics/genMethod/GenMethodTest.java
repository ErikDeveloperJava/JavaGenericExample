package example.generics.genMethod;

import java.util.Arrays;

public class GenMethodTest {

    public static void main(String[] args) {
        String[] strArray = {"H", "M", "Z", "$"};
        String strMin = min(strArray);
        Integer[] integerArray = {1, 2, 3, 4};
        Integer integerMin = min(integerArray);
        System.out.println(Arrays.toString(strArray) + " min : " + strMin);
        System.out.println(Arrays.toString(integerArray) + " min : " + integerMin);
    }

    private static <T extends Comparable<T>> T min(T[] array){
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(min.compareTo(array[i]) > 0){
                min = array[i];
            }
        }
        return min;
    }
}
