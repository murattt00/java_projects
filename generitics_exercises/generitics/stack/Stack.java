package generitics.stack;

import java.util.List;

public interface Stack<T> {
     void push(T item);
     T pop ();
     boolean empty();
    List<T> tolist();
    default void addAll(Stack<? extends T> aStack){
        List<? extends T> values = aStack.tolist().reversed();
        for (T v : values) {
            this.push(v);
        }
    }
}
