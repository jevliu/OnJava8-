/**
 * @author 刘季伟
 * @implNote 局部内部类和匿名内部类的比较
 * @since 2024/4/27 21:06:53
 */
interface Counter{
    int next();
}
public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name){
        // 一个局部内部类
        class LocalCounter implements Counter{
            LocalCounter(){
                // 局部内部类可以有自己的构造器
                System.out.println("LocalCounter()");
            }
            @Override
            public int next(){
                System.out.print(name);
                return count++;
            }
        }
        return new LocalCounter();
    }
    // 另一种使用匿名内部类的方法
    Counter getCounter2(final String name){
        return new Counter() {
            {
                System.out.println("Counter()");
            }
            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter c1 = lic.getCounter("Local inner "), c2 = lic.getCounter2("Anonymous inner ");
        for (int i = 0; i < 5; i++){
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++){
            System.out.println(c2.next());
        }
    }
}
