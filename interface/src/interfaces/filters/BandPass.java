package interfaces.filters;

/**
 * @author 刘季伟
 * @implNote 大写和小写的组合
 * @since 2024/4/27 10:42:16
 */
public class BandPass extends Filter{
    double lowCutoff, highCutoff;
    public BandPass(double lowCutoff, double highCutoff){
        this.highCutoff = highCutoff;
        this.lowCutoff = lowCutoff;
    }
    @Override
    public Waveform process(Waveform input){
        return input;
    }
}
