package phan02_Bai03;

public class CashPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Thanh toán " + amount + " bằng Tiền mặt.");
        return true;
    }

    @Override
    public String getMethod() {
        return "Tiền mặt";
    }
}
