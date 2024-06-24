package interfaces.interfaceprocessor;
import java.util.*;
/**
 * @author 刘季伟
 * @implNote 展示服用代码的第一种方式：客户端程序员遵循接口编写类
 * @since 2024/4/27 10:50:20
 */


public interface StringProcessor extends Processor {
    @Override
    String process(Object input);
    String S = "If she weighs the same as a duck, she's made of wood";
    static void main(String[] args){
        Applicator.apply(new Upcase(), S);
        Applicator.apply(new Downcase(), S);
        Applicator.apply(new Splitter(), S);
    }
}
class Upcase implements StringProcessor{
    // 返回协变类型
    public String process(Object input){
        return ((String) input).toUpperCase();
    }
}
class Downcase implements StringProcessor{
    @Override
    public String process(Object input){
        return ((String) input).toLowerCase();
    }
}
class Splitter implements StringProcessor{
    @Override
    public String process(Object input){
        return Arrays.toString(((String) input).split(" "));
    }
}
