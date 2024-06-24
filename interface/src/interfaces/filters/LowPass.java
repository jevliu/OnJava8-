package interfaces.filters;

/**
 * @author 刘季伟
 * @implNote 将波形转为小写形式
 * @since 2024/4/27 10:38:12
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }
    @Override
    public Waveform process(Waveform input){
        return input; // 哑处理
    }
}
