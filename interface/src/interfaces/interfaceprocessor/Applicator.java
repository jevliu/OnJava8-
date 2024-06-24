package interfaces.interfaceprocessor;

/**
 * @author 刘季伟
 * @implNote 应用接口Processor
 * @since 2024/4/27 10:48:40
 */
public class Applicator {
    public static void apply(Processor p, Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
