/**
 * @author 刘季伟
 * @implNote 展示通过this 关键字在向其他方法传递当前对象时的作用
 * @since 2024/4/16 14:27:10
 */
class Person{
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}
class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}
class Apple{
    Apple getPeeled(){
        return Peeler.peel(this); // 使用this 将自身传递出去
    }
}

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
