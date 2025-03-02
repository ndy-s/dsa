package hendys.datastructures.stack;

import java.util.ArrayList;

public class DynamicStack implements Stack {
    private ArrayList<Object> stack;

    public DynamicStack() {
        stack = new ArrayList<Object>();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void push(Object elem) {
        stack.add(elem);
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return stack.remove(size() - 1);
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return stack.get(size() - 1);
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
