package ComparableTest;

//2.定义测试类Test,在测试类Test中定义测试方法Comparable getMax(Comparable c1,Comparable c2)完成测试
public class TestComparable {
    public static void main(String[] args) {
        //创建两个Stedent对象，并调用getMax方法完成测试
        Student s1 = new Student();
        s1.setUsername("张三");
        s1.setAge(22);

        Student s2 = new Student();
        s2.setUsername("李四");
        s2.setAge(25);

        Comparable max = getMax(s1,s2);
        System.out.println(max);
    }

    public static  Comparable getMax(Comparable c1,Comparable c2){
        int result = c1.compareTo(c2);
        //如果result < 0, 则c1比c2小；
        //如果result > 0, 则c1比c2大；
        //如果result = 0, 则c1和c2相等
        if (result>=0){
            return c1;
        }else {
            return c2;
        }
    }
}
