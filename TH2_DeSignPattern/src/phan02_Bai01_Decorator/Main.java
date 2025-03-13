package phan02_Bai01_Decorator;

public class Main {
    public static void main(String[] args) {
 
        OrderComponent order = new BaseOrder();
        System.out.println("=== Đơn hàng cơ bản ===");
        order.processOrder();

        OrderComponent notifiedOrder = new NotifyCustomerDecorator(order);
        System.out.println("\n=== Đơn hàng có thông báo khách hàng ===");
        notifiedOrder.processOrder();

        OrderComponent loggedAndNotifiedOrder = new LoggingDecorator(new NotifyCustomerDecorator(order));
        System.out.println("\n=== Đơn hàng có thông báo và ghi log ===");
        loggedAndNotifiedOrder.processOrder();

        OrderComponent fullFeatureOrder = new ShippingFeeDecorator(new LoggingDecorator(new NotifyCustomerDecorator(order)));
        System.out.println("\n=== Đơn hàng có phí vận chuyển, thông báo và ghi log ===");
        fullFeatureOrder.processOrder();
    }
}
