package MergeSort;

import java.util.Arrays;

public class MergeTest {
    public static void main(String[] args) {
        Integer[] a = {8,6,4,5,3,1,9,2,10,11,7};
        Merge.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
