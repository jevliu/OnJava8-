/**
 * @author 刘季伟
 * @implNote 展示volatile 关键字的作用
 * @since 2024/6/24 21:12:25
 */
public class SharedResource {
    private volatile boolean flag = false;

    public void writer(){
        flag = true;
        System.out.println("Writer: changed flag to true");
    }

    public void reader(){
        while (!flag){
            // 等待flag 变为true
        }
        System.out.println("Reader: flag is true now!");
    }
}


