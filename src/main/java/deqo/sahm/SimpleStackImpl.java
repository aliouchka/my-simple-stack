package deqo.sahm;

import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by aliouchka on 08/11/16.
 */
public class SimpleStackImpl implements SimpleStack{

    private Stack<Item> stack = new Stack<Item>();

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    /*
    *com to #1
    */
    @Override
    public void push(Item item) {
        stack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) stack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) stack.pop();
    }
}
