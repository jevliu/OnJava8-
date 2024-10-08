package onjava;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
/**
 * @author 刘季伟
 * @implNote
 * @since 2024/9/4 10:43:45
 */
public class Suppliers {
    // Create a collection and fill it:
    public static <T, C extends Collection<T>> C
    create(Supplier<C> factory, Supplier<T> gen, int n) {
        return Stream.generate(gen)
                .limit(n)
                .collect(factory, C::add, C::addAll);
    }
    // Fill an existing collection:
    public static <T, C extends Collection<T>>
    C fill(C coll, Supplier<T> gen, int n) {
        Stream.generate(gen)
                .limit(n)
                .forEach(coll::add);
        return coll;
    }
    // Use an unbound method reference to
    // produce a more general method:
    public static <H, A> H fill(H holder,
                                BiConsumer<H, A> adder, Supplier<A> gen, int n) {
        Stream.generate(gen)
                .limit(n)
                .forEach(a -> adder.accept(holder, a));
        return holder;
    }
}

