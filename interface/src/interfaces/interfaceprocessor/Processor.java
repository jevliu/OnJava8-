package interfaces.interfaceprocessor;

/**
 * @author 刘季伟
 * @implNote 将Processor 重新定义为一个接口来提升代码的服用性，保证apply() 方法可以在别处也能应用
 * @since 2024/4/27 10:46:34
 */
public interface Processor {
    default String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input);
}
