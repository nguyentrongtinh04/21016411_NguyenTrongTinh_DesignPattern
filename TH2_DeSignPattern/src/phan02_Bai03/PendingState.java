package phan02_Bai03;

public class PendingState implements PaymentState {
    @Override
    public void handlePayment(PaymentContext context) {
        System.out.println("Giao dịch đang chờ xử lý...");
    }

    @Override
    public String getState() {
        return "Chờ xử lý";
    }
}
