package phan02_Bai01_Decorator;

public class LoggingDecorator extends OrderDecorator {
    public LoggingDecorator(OrderComponent order) {
        super(order);
    }

    @Override
    public void processOrder() {
        super.processOrder();
        logOrder();
    }

    private void logOrder() {
        System.out.println("Ghi log: Lưu trạng thái đơn hàng vào hệ thống.");
    }
}
