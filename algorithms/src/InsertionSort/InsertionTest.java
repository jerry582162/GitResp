package InsertionSort;

import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a = {4,3,5,7,2,6,1,9,8};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
