package phan02_Bai01_Decorator;

public class ShippingFeeDecorator extends OrderDecorator {
    public ShippingFeeDecorator(OrderComponent order) {
        super(order);
    }

    @Override
    public void processOrder() {
        super.processOrder();
        addShippingFee();
    }

    private void addShippingFee() {
        System.out.println("Phí vận chuyển: Tính phí vận chuyển cho đơn hàng.");
    }
}
