package phan02_Bai03;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;
    private PaymentState paymentState;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        this.paymentState = new PendingState();
    }

    public void processPayment(double amount) {
        System.out.println("Phương thức thanh toán: " + paymentStrategy.getMethod());
        paymentState.handlePayment(this);

        if (paymentStrategy.processPayment(amount)) {
            setPaymentState(new SuccessState());
        } else {
            setPaymentState(new FailedState());
        }

        paymentState.handlePayment(this);
    }

    public void setPaymentState(PaymentState state) {
        this.paymentState = state;
    }
}
