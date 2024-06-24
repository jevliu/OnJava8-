/**
 * @author 刘季伟
 * @implNote 展示可变参数列表的使用
 * @since 2024/4/19 13:05:04
 */

class A {}
public class VarArgs {
    static void printArray(Object... args){
        for (Object obj : args){
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{47, (float)3.14, 11.11});
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()}); // 打印类名和对象的地址

        // java 5 中引进的新特性，可以直接使用不同的参数类型在传参时
        printArray(47, 3.14f, 11.11); // 传入的时候会被自动填充为一个数组
        printArray((Object[]) new Integer[] {1, 2, 3, 4}); // 也可以直接创建一个数组
        printArray(); // 可变的参数个数也可以是0
    }
}

