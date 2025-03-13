package phan02_Bai03;

public class SuccessState implements PaymentState {
    @Override
    public void handlePayment(PaymentContext context) {
        System.out.println("Giao dịch thành công!");
    }

    @Override
    public String getState() {
        return "Thành công";
    }
}