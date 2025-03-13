package phan02_Bai03;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Thanh toán " + amount + " bằng Thẻ tín dụng.");
        return true; // Giả sử luôn thành công
    }

    @Override
    public String getMethod() {
        return "Thẻ tín dụng";
    }
}
