/**
 * @author 刘季伟
 * @implNote 展示使用方法引用和Lambda 表达式来分别实现方法在调用时表现出不同行为的特征
 * @since 2024/6/22 19:27:14
 */

interface Strategy{
    String approach(String msg);
}

class Soft implements Strategy{
    public String approach(String msg){
        return msg.toLowerCase() + "?";
    }
}

class Unrelated{
    static String twice(String msg){
        return msg + " " + msg;
    }
}
public class Strategize {
    Strategy strategy;
    String msg;
    Strategize(String msg){
        strategy = new Soft();
        this.msg = msg;
    }

    void communicate(){
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                new Strategy() {
                    @Override
                    public String approach(String msg) {
                        return msg.toUpperCase() + "!";
                    }
                },
                msg -> msg.substring(0, 5),
                Unrelated::twice, // 方法引用
        };
        Strategize s = new Strategize("Hello there");
        s.communicate();
        for (Strategy newStrategy : strategies) {
            s.changeStrategy(newStrategy);
            s.communicate();
        }
    }
}
