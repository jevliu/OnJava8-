/**
 * @author 刘季伟
 * @implNote 展示使用迭代器来实现适配器模型的使用示例
 * @since 2024/6/22 14:07:25
 */
import java.util.*;

// 目标接口：双向迭代器
interface ReversibleIterator<T> extends Iterator<T>{
    boolean hasPrevious();
    T previous();
}

// 适配者：ArraList (只提供正向迭代)
class WordList{
    private List<String> words = new ArrayList<>();

    public void addWord(String word){
        words.add(word);
    }
    public Iterator<String> iterator(){
        return words.iterator();
    }
}

// 适配器：实现双向迭代
class ReversibleIteratorAdapter implements ReversibleIterator<String>{
    private List<String> words;
    private int index;

    public ReversibleIteratorAdapter(WordList wordList){
        this.words = new ArrayList<>();
        Iterator<String> iterator = wordList.iterator();
        while (iterator.hasNext()){
            words.add(iterator.next());
        }
        this.index = 0;
    }

    @Override
    public boolean hasNext(){
        return index < words.size();
    }

    @Override
    public String next(){
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return words.get(index++);
    }

    @Override
    public boolean hasPrevious(){
        return index > 0;
    }

    @Override
    public String previous(){
        if (!hasPrevious()){
            throw new NoSuchElementException();
        }
        return words.get(--index);
    }
}
public class AdapterPatternDemo {
    public static void main(String[] args) {
        WordList wordList = new WordList();
        wordList.addWord("Hello");
        wordList.addWord("World");
        wordList.addWord("Adapter");
        wordList.addWord("Pattern");

        ReversibleIterator<String> adapter = new ReversibleIteratorAdapter(wordList);

        System.out.println("Forward iteration:");
        while (adapter.hasNext()){
            System.out.println(adapter.next());
        }

        System.out.println("\nBackward iteration:");
        while (adapter.hasPrevious()){
            System.out.println(adapter.previous());
        }
    }
}
