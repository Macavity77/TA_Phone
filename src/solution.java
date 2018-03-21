import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class solution {
    public static int[] sort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int max_value = array[0];
        //finding the maxiam value of this array
        for (int i : array) {
            if (i > max_value) {
                max_value = i;
            }
        }
        int[] bucket = new int[max_value + 1];
        //put into bucket
        for (int i : array) {
            bucket[i]++;
        }
        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                array[index++] = i;
            }
        }
        return array;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{2,1,44,3})));
    }
}