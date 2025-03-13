package phan02_Bai01_Strategy;

public class Order {
    private OrderStrategy strategy;

    public void setStrategy(OrderStrategy strategy) {
        this.strategy = strategy;
    }

    public void process() {
        if (strategy != null) {
            strategy.processOrder();
        } else {
            System.out.println("Chưa có chiến lược xử lý đơn hàng.");
        }
    }
}

