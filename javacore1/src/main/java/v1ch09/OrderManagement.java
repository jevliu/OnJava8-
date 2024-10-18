package v1ch09;
import java.util.*;
/**
 * @author 刘季伟
 * @implNote 使用Map来创建一个订单系统，用来储存顾客与订单之间的关系。具有以下的功能：
 * -- 添加订单到顾客
 * -- 返回一个顾客的所有订单视图
 * -- 返回所有订单的数量
 * @since 2024/10/18 10:19:41
 */
public class OrderManagement {
    private Map<String, List<String>> orders = new HashMap<>();

    // 添加订单
    public void addOrder(String customer, String order) {
        orders.computeIfAbsent(customer, k -> new ArrayList<>()).add(order);
    }

    // 获取顾客的订单视图
    public List<String> getCustomerOrders(String customer) {
        return orders.getOrDefault(customer, Collections.emptyList());
    }

    // 返回所有订单数量
    public int totalOrderCount() {
        return orders.values().stream().mapToInt(List::size).sum();
    }

    public static void main(String[] args) {
        OrderManagement om = new OrderManagement();
        om.addOrder("Alice", "订单001");
        om.addOrder("Bob", "订单002");
        om.addOrder("Alice", "订单003");

        System.out.println("Alice的订单：" + om.getCustomerOrders("Alice"));
        System.out.println("总订单数量：" + om.totalOrderCount());
    }
}
