package onjava;

import java.util.concurrent.*;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/4/18 21:20:43
 */
public class Nap {
    public Nap(double t){
        try {
            TimeUnit.MILLISECONDS.sleep((int)(1000 * t));
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public Nap(double t, String msg){
        this(t);
        System.out.println(msg);
    }

}
