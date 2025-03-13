package phan02_Bai03;

public abstract class PaymentDecorator implements PaymentStrategy {
    protected PaymentStrategy paymentStrategy;

    public PaymentDecorator(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public boolean processPayment(double amount) {
        return paymentStrategy.processPayment(amount);
    }

    @Override
    public String getMethod() {
        return paymentStrategy.getMethod();
    }
}
