package generitics.stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Object> stack = new StackImpl();;
        stack.push(1);
        stack.push(2.5);
        stack.push("Hello");

        System.out.println(stack.tolist());
//        while (!stack.empty()) {
//            System.out.println(stack.pop());
//        }
        Stack<String> stack2 = new StackImpl();
        stack2.push("aaa");
        stack2.push("bbb");
        stack2.push("ccc");
        System.out.println(stack2.tolist());
        Stack<Integer> stack3 = new StackArrayImpl<>();
        stack3.push(10);
        stack3.push(11);
        stack3.push(12);
        stack3.push(13);
        stack3.push(14);

        stack.addAll(stack2);
       System.out.println(stack.tolist());
    }

}