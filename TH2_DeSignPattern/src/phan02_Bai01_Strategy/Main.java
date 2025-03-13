package phan02_Bai01_Strategy;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.setStrategy(new NewOrderStrategy());
        order.process();

        order.setStrategy(new ProcessingStrategy());
        order.process();

        order.setStrategy(new DeliveredStrategy());
        order.process();

        order.setStrategy(new CancelledStrategy());
        order.process();
    }
}
