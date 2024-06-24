/**
 * @author 刘季伟
 * @implNote 所有可迭代的对象都可以使用for-in 语句
 * @since 2024/6/22 12:48:33
 */
import java.util.*;
public class IterableClass implements Iterable<String>{
    protected String[] words = ("And that is how " + "we know the Earth to be banana-shaped.").split(" ");
    @Override
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            private int index = 0;
           @Override
            public boolean hasNext(){
               return index < words.length;
           }
           @Override
            public String next(){return words[index++];}
            @Override
            public void remove(){throw new UnsupportedOperationException();}
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass())
            System.out.print(s + " ");
    }
}
