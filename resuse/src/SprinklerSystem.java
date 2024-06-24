/**
 * @author 刘季伟
 * @implNote 展示“组合”的用法
 * @since 2024/4/19 17:27:47
 */

class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s = "Constructed";
    }
    @Override
    public String toString(){
        return s;
    }
}

public class SprinklerSystem {
    private String value1, value2, value3, value4, value5;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    @Override
    public String toString(){
        return
                "value1 = " + value1 + " " +
                        "value2 = " + value2 + " " +
                        "value3 = " + value3 + " " +
                        "value4 = " + value4 + " " +
                        "value5 = " + value5 + "\n" +
                        "source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}
