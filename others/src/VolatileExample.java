/**
 * @author 刘季伟
 * @implNote 展示volatile 关键字的作用
 * @since 2024/6/24 21:15:55
 */
public class VolatileExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        new Thread(resource::writer).start();
        new Thread(resource::reader).start();
    }
}
