/**
 * @author 刘季伟
 * @implNote 当涉及到一个对象被其他一个或多个成员对象共享时，使用引用计数来追踪仍然访问着共享对象的对象数量。
 * @since 2024/4/26 21:40:48
 */
class Shared{
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    Shared(){
        System.out.println("Creating " + this);
    }
    public void addRef(){
        refcount++;
    }
    protected void dispose(){
        if (--refcount == 0){
            System.out.println("Disposing " + this);
        }
    }
    @Override
    public String toString(){
        return  "Shared" + id;
    }
}
class Composing{
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    Composing(Shared shared){
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose(){
        System.out.println("disposing " + this);
        shared.dispose();
    }
    @Override
    public String toString(){
        return "Composing " + id;
    }
}
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
        };
        for (Composing c : composing){
            c.dispose();
        }
    }
}
