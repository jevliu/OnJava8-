/**
 * @author 刘季伟
 * @implNote 泛型数组
 * @since 2024/9/4 14:02:39
 */
class ClassParameter<T> {
    // 不能实例化参数化类型的数组，但可以参数化数组本身的类型
    public T[] f(T[] arg) {return arg;}
}

class MethodParameter {
    public static <T> T[] f(T[] arg) {return arg;} // 参数化方法
}
public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles2 = new ClassParameter<Double>().f(doubles);
        ints = MethodParameter.f(ints);
        doubles2 = MethodParameter.f(doubles);
    }
}
