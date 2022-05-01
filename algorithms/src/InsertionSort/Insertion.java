package InsertionSort;

public class Insertion {
    public static void sort(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >0 ; j--) {
                //比较索引J处的值和索引J-1外的值，如果索引J-1处的值比索引J处的值大，
                // 则交换数据，如果不大，那么就找到合适的位置了，退出循环即可
                if (greater(a[j-1],a[j])){
                    exch(a,j-1,j);
                }else {
                    break;
                }
            }
        }
    }
    //比较V元素是否大于W元素
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    //数组元素i和j交换位置
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}
