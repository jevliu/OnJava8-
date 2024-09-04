package onjava;
import java.util.*;
import java.util.function.*;
import static onjava.ConvertTo.*;
/**
 * @author 刘季伟
 * @implNote 为不同类型生成增量值
 * @since 2024/9/4 15:04:33
 */
public interface Count {
    class Boolean implements Supplier<java.lang.Boolean> {
        private boolean b = true;
        @Override
        public java.lang.Boolean get() {
            b = !b;
            return java.lang.Boolean.valueOf(b);
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
        private boolean b = true;
        public boolean get() {
            b = !b;
            return b;
        }
        public boolean get(int n) {return get();}
        public boolean[] array(int sz) {
            return primitive(new Boolean().array(sz));
        }
    }

    class Integer implements Supplier<java.lang.Integer> {
        int i;
        @Override
        public java.lang.Integer get() {return i++;}
        public java.lang.Integer get(int n) {
            return get();
        }
        public java.lang.Integer[] array(int sz) {
            java.lang.Integer[] result = new java.lang.Integer[sz];
            Arrays.setAll(result, n -> get());
            return result;
        }
    }

    class Pint implements IntSupplier {
        int i;
        public int get() {return i++;}
        public int get(int n) {return get();}
        @Override
        public int getAsInt(){return get();}
        public int[] array(int sz) {return primitive(new Integer().array(sz));}
    }
}
