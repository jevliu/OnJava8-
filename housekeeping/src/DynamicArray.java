

/**
 * @author 刘季伟
 * @implNote 展示动态数组创建的灵活性，可以在方法内部在调用时创建
 * @since 2024/4/19 12:59:22
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[] {"fiddle", "de", "dum"});
    }
}

class Other{
    public static void main(String[] args) {
        for (String s : args){
            System.out.print(s + " ");
        }
    }
}
