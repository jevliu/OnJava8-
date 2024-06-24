package interfaces.interfaceprocessor;
import interfaces.filters.*;
/**
 * @author 刘季伟
 * @implNote 展示使用适配器设计模式：允许代码接受已有的接口产生需要的接口
 * @since 2024/4/27 11:02:52
 */

class FilterAdapter implements Processor{
    Filter filter;
    FilterAdapter(Filter filter){
        this.filter = filter;
    }
    @Override
    public String name(){ // 在这里使用了委托的形式
        return filter.name();
    }
    @Override
    public Waveform process(Object input){
        return filter.process((Waveform) input);
    }
}
public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Applicator.apply(new FilterAdapter(new LowPass(1.0)), w);
        Applicator.apply(new FilterAdapter(new HighPass(2.0)), w);
        Applicator.apply(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }}
