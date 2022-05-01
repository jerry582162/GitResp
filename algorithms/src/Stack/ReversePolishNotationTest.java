package Stack;

public class ReversePolishNotationTest {
    public static void main(String[] args) {
        //中缀表达式 3*（17-15）+18/6
        String[] notation = {"3","17","15","-","*","18","6","/","+"};
        int result = calculate(notation);
        System.out.println("逆波兰表达式的结果为："+ result);
    }
    /*
    * notaion 逆波兰表达式的数组表达方式
    * return 逆波兰表达式的计算结果
    * */

    public static int calculate(String[] notaion){
        //1、定义一个栈，用来存储操作数
        Stack<Integer> oprands = new Stack<Integer>();
        //2、从左往右遍历逆波兰表达式，得到每一个元素
        for (int i = 0; i < notaion.length; i++) {
            String curr = notaion[i];
            //判断当前元素是去处符还是操作数
            Integer O1;
            Integer O2;
            Integer result;
            switch (curr){
                case  "+":
                    //运算符，从栈中弹出两个操作数，完成运算，运算完的结果再压入栈中
                    O1 = oprands.pop();
                    O2 = oprands.pop();
                    result = O2+O1;
                    oprands.push(result);
                    break;
                case  "-":
                    O1 = oprands.pop();
                    O2 = oprands.pop();
                    result = O2-O1;
                    oprands.push(result);
                    break;
                case  "*":
                    O1 = oprands.pop();
                    O2 = oprands.pop();
                    result = O2*O1;
                    oprands.push(result);
                    break;
                case  "/":
                    O1 = oprands.pop();
                    O2 = oprands.pop();
                    result = O2/O1;
                    oprands.push(result);
                    break;
                default:
                    //5、操作数，把该操作数放入到栈中
                    oprands.push(Integer.parseInt(curr));
                    break;
            }
        }
        //得到栈中最后一个元素，就是逆波兰表达式的结果
        int result = oprands.pop();
        return result;
    }
}
