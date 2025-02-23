package stack;

import stack.Stack;

public class StackImpl implements Stack  {
    private StackItem top;
    @Override
    public void push(Object item) {
        StackItem newItem = new StackItem(item);
        newItem.setNext(top);
        top = newItem;
    }

    @Override
    public Object pop() {
        if (empty()){
            throw new IllegalStateException("The stack is empty!");
        }
        Object item = top.getItem();
        top = top.getNext();
        return item;
    }

    @Override
    public boolean empty() {

        return top == null;
    }
}
