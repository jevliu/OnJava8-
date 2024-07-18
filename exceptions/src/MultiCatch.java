/**
 * @author 刘季伟
 * @implNote 展示Java 7 中的多重捕获机制
 * @since 2024/7/18 11:46:21
 */

class EBase1 extends Exception{}
class Except1 extends EBase1{}
class EBase2 extends Exception{}
class Except2 extends EBase2{}
class EBase3 extends Exception{}
class Except3 extends EBase3{}
class EBase4 extends Exception{}
class Except4 extends EBase4{}

public class MultiCatch {
    void x() throws Except1, Except2, Except3, Except4{}
    void process(){}
    void f(){
        try {
            x();
        }catch (Except1 | Except2 | Except3 | Except4 e){
            process();
        }
    }
}
