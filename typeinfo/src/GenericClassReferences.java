/**
 * @author 刘季伟
 * @implNote 泛型语法会对Class引用锁指向的Class对象的类型进行限定
 * @since 2024/8/15 16:07:51
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // 同一个东西
        intClass = double.class;
    }
}
