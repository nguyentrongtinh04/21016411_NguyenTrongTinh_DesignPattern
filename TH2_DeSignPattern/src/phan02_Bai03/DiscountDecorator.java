package phan02_Bai03;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }

    @Override
    public boolean processPayment(double amount) {
        double discount = amount * 0.1; // Giảm 10%
        System.out.println("Áp dụng mã giảm giá: -" + discount);
        return super.processPayment(amount - discount);
    }
}
