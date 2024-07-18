/**
 * @author 刘季伟
 * @implNote 展示如何使用Exception 类型的方法
 * @since 2024/7/18 11:41:26
 */
public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e){
            System.out.println("Caught Exception");
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage());
            System.out.println("toString(): " + e);
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}
