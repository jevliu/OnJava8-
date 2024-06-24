/**
 * @author 刘季伟
 * @implNote 展示枚举类型在switch 语句中的作用
 * @since 2024/4/19 13:41:35
 */
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree){
        this.degree = degree;
    }

    public void describe(){
        System.out.print("This burrito is ");
        switch (degree){
            case NOT -> System.out.println("not spicy at all.");
            case MILD,MEDIUM -> System.out.println("a little hot");
            default -> System.out.println("maybe too hot");

        }
    }

    public static void main(String[] args) {
        Burrito plain = new Burrito(Spiciness.HOT),
                greenChile = new Burrito(Spiciness.MEDIUM),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
