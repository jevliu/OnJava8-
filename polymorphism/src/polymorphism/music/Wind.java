package polymorphism.music;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/4/26 20:10:07
 */
public class Wind extends Instrument{
    @Override
    public void play(Note n){
        System.out.println("Wind.play() " + n);
    }
}
