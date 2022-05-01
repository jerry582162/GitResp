package Stack;

public class QueueTest {
    public static void main(String[] args) {
        //创建队列对象
        Queue<String> q = new Queue<String>();
        // Queue<String> q = new Queue<String>();
        //测试队列的enqueue方法
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        q.enqueue("d");

        //遍历队列
//        for (String str : q) {
//            System.out.println(str);
//        }
        System.out.println("---------------");

        //测试队列的dequeue方法
        String result = q.dequeue();
        System.out.println("出队列的元素是： "+result);
        System.out.println("剩余的元素个数： "+ q.size());

    }
}
