import java.util.*;
/**
 * @author 刘季伟
 * @implNote 使用Builder设计模式来应用格式修饰符来打印一个购物收据。
 * @since 2024/8/12 10:15:01
 */
public class ReceiptBuilder {
    private double total = 0;
    private Formatter f = new Formatter(new StringBuilder());
    public ReceiptBuilder(){
        f.format("%-15s %5s %10s%n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s%n", "----", "---", "-----");
    }
    public void add(String name, int qty, double price){
        f.format("%-15.15s %5d %10.2f%n", name, qty, price);
        total += price * qty;
    }
    public String build(){
        f.format("%-15s %5s %10.2f%n", "Tax", "", total * 0.06);
        f.format("%-15s %5s %10s%n", "", "", "-----");
        f.format("%-15s %5s %10.2f%n", "Total", "", total * 1.06);
        return f.toString();
    }
    public static void main(String[] args){
        ReceiptBuilder receiptBuilder = new ReceiptBuilder();
        receiptBuilder.add("Jack's Magic Beans", 4, 4.25);
        receiptBuilder.add("Princess Peas", 3, 5.10);
        receiptBuilder.add("Three Bears Porridge", 1, 14.29);
        System.out.println(receiptBuilder.build());
    }
}
