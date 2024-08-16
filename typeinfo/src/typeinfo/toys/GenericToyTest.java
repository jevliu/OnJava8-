package typeinfo.toys;

/**
 * @author 刘季伟
 * @implNote 将泛型应用与ToyTest类。
 * @since 2024/8/16 10:02:54
 */
public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        // 将会产生具体的类型
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        Object obj = up.newInstance();
    }
}
