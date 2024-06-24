/**
 * @author 刘季伟
 * @implNote 展示策略设计模式的使用示例：创建一个能根据传入的参数类型从而具备不同行为的方法
 * @since 2024/4/27 10:17:08
 */
import java.util.*;

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    public Object process(Object input){
        return input;
    }
}
class Upcase extends Processor{
    // 返回协变类型
    @Override
    public String process(Object input){
        return ((String) input).toUpperCase();
    }
}
class Downcase extends Processor{
    @Override
    public String process(Object input){
        return ((String) input).toLowerCase();
    }
}
class Splitter extends Processor{
    @Override
    public String process(Object input){
        // split() divides a String into pieces:
        return Arrays.toString(((String) input).split(" "));
    }
}
public class Applicator {
    public static void apply(Processor p, Object s){ // 这里的Processor 就是策略
        System.out.println("Using processor " + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
        String s = "We are such stuff as dreams are made on";
        apply(new Upcase(), s);
        apply(new Downcase(), s);
        apply(new Splitter(), s);
    }
}
