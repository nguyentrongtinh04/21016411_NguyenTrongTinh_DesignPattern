package phan02_Bai01_Decorator;

public abstract class OrderDecorator implements OrderComponent {
    protected OrderComponent order;

    public OrderDecorator(OrderComponent order) {
        this.order = order;
    }

    @Override
    public void processOrder() {
        order.processOrder(); 
    }
}
