package Print8;

public class Print8 {
    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num = 5;
        print(num);

        int tt = 5;
        print(tt << 1);//左移一位 等同于*2
        print(~tt);

        print(~tt + 1);//负数等于 取反加1
        System.out.println(~tt + 1);

        int a = Integer.MAX_VALUE;
        System.out.println(a);

        int b = Integer.MIN_VALUE;
        System.out.println(b);
    }
}

