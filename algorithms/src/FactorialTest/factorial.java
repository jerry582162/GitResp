package FactorialTest;

public class factorial {
    public static void main(String[] args) throws Exception{
        long result = factorial(5);
        System.out.println(result);
    }
    public static long factorial(int n){
        if (n<=0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
