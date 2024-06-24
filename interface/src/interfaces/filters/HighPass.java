package interfaces.filters;

/**
 * @author 刘季伟
 * @implNote 将波形转为大写形式
 * @since 2024/4/27 10:40:17
 */
public class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
    @Override
    public Waveform process(Waveform input){
        return input; // 同样进行哑处理
    }
}
