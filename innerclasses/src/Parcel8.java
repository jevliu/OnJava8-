/**
 * @author 刘季伟
 * @implNote 展示匿名内部类如果需要含参的构造器时该如何创建(目前有问题)
 * @since 2024/4/27 16:15:03
 */
public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            // ...
        };
    }
}
