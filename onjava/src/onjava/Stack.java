package onjava;
import java.util.Deque;
import java.util.ArrayDeque;
/**
 * @author 刘季伟
 * @implNote 栈的实现
 * @since 2024/5/24 10:39:32
 */
public class Stack<T> {
    // 引入了泛型
    private Deque<T> storage = new ArrayDeque<>();
    public void push(T v){storage.push(v);}
    public T peek(){return storage.peek();}
    public T pop(){return storage.pop();}
    public boolean isEmpty(){return storage.isEmpty();}
    @Override
    public String toString(){
        return storage.toString();
    }
}
