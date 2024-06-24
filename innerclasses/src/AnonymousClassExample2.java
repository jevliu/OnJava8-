/**
 * @author 刘季伟
 * @implNote 使用匿名内部类来扩展抽象类
 * @since 2024/6/22 13:23:08
 */
abstract class Animal{
    abstract void makeSound();
}
public class AnonymousClassExample2 {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Meow!");
            }
        };

        cat.makeSound();
    }
}
