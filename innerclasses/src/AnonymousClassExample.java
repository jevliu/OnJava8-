/**
 * @author 刘季伟
 * @implNote 展示如何通过匿名内部类来实现接口
 * @since 2024/6/22 13:19:31
 */
interface Greeting{
    void greet();
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        Greeting englishGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello!");
            }
        };

        englishGreeting.greet();
    }
}
