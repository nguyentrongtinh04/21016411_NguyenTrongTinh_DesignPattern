package phan02_Bai03;

public class FailedState implements PaymentState {
    @Override
    public void handlePayment(PaymentContext context) {
        System.out.println("Giao dịch thất bại. Hoàn tiền...");
    }

    @Override
    public String getState() {
        return "Thất bại";
    }
}
