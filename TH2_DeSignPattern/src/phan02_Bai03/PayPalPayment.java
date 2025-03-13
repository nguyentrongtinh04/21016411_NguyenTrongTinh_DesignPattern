package phan02_Bai03;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Thanh toán " + amount + " bằng PayPal.");
        return Math.random() > 0.2; // Xác suất thất bại 20%
    }

    @Override
    public String getMethod() {
        return "PayPal";
    }
}
