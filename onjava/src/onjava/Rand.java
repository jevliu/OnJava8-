package onjava;
import java.util.*;
import java.util.function.*;
import static onjava.ConvertTo.*;

/**
 * @author 刘季伟
 * @implNote 按照Count.java的结构创建一个生成随机值的工具
 * @since 2024/9/4 15:33:13
 */
public interface Rand {
    int MOD = 10_000;
    class Boolean implements Supplier<java.lang.Boolean> {
        SplittableRandom r = new SplittableRandom(47);
        @Override
        public java.lang.Boolean get() {
            return r.nextBoolean();
        }
        public java.lang.Boolean get(int n) {
            return get();
        }
        public java.lang.Boolean[] array(int sz) {
            java.lang.Boolean[] result = new java.lang.Boolean[sz];
            Arrays.setAll(result, n -> get());
            return result;
        }
    }

    class Pboolean {
        public boolean[] array(int sz) {
            return primitive(new Boolean().array(sz));
        }
    }

    class Integer implements Supplier<java.lang.Integer> {
        SplittableRandom r = new SplittableRandom(47);
        @Override
        public java.lang.Integer get() {
            return r.nextInt(MOD);
        }
        public java.lang.Integer get(int n) {
            return get();
        }
        public java.lang.Integer[] array(int sz) {
            int[] primitive = new Count.Pint().array(sz);
            java.lang.Integer[] result = new java.lang.Integer[sz];
            for (int i = 0; i < sz; i++) {
                result[i] = primitive[i];
            }
            return result;
        }
    }

    class Pint implements IntSupplier {
        SplittableRandom r = new SplittableRandom(47);
        @Override
        public int getAsInt() {
            return r.nextInt(MOD);
        }
        public int get(int n) {return getAsInt();}
        public int[] array(int sz) {
            return r.ints(sz, 0, MOD).toArray();
        }
    }
}
