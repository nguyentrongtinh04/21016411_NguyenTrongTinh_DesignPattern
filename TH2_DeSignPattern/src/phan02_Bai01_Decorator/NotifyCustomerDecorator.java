package phan02_Bai01_Decorator;

public class NotifyCustomerDecorator extends OrderDecorator {
    public NotifyCustomerDecorator(OrderComponent order) {
        super(order);
    }

    @Override
    public void processOrder() {
        super.processOrder();
        sendNotification();
    }

    private void sendNotification() {
        System.out.println("Thông báo: Gửi email/SMS cho khách hàng về trạng thái đơn hàng.");
    }
}
