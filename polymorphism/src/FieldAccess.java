import polymorphism.shape.Shape;

/**
 * @author 刘季伟
 * @implNote 警惕只有普通的方法调用可以是多态的，如果直接访问一个属性，该访问会在编译时解析
 * @since 2024/4/26 20:44:43
 */
class Super{
    public int field = 0;
    public int getField(){
        return field;
    }
}
class Sub extends Super{
    public int field = 1;
    @Override
    public int getField(){
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub(); // 向上转型
        // Sub 中有两个独立的称为field 的属性：自己的和来自Super的，当向上转型并引用field时，会指向Super的field属性。
        System.out.println("sup.field = " + sup.field + ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field + ", sub.getField() = " + sub.getField() +
                ", sub.getSuperField() = " + sub.getSuperField());
    }
}
