/**
 * @author 刘季伟
 * @implNote 使用.new 语法实现告知某些其他对象去创建某个内部类的对象。
 * @since 2024/4/27 15:45:57
 */
public class DotNew {
    public class Inner{}
    public static void main(String[] args){
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner(); // 必须使用外部类的对象来创建该内部类对象
    }
}
