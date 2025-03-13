package phan02_Bai03;

public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }

    @Override
    public boolean processPayment(double amount) {
        double fee = amount * 0.02; // Phí 2%
        System.out.println("Áp dụng phí xử lý: " + fee);
        return super.processPayment(amount + fee);
    }
}
