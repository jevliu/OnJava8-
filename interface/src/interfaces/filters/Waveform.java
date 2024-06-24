package interfaces.filters;

/**
 * @author 刘季伟
 * @implNote 创建一个电子滤波器来使用Applicator 中的 apply() 方法. 定义一个波形的类
 * @since 2024/4/27 10:32:47
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString(){
        return "Waveform " + id;
    }
}
