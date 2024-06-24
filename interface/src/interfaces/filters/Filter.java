package interfaces.filters;

/**
 * @author 刘季伟
 * @implNote 定义滤波器，其中的process() 方法将应用策略模型，根据传入类型来决定具体的滤波行为
 * @since 2024/4/27 10:35:05
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){
        return input;
    }
}
