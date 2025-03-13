package phan02_Bai03;

public interface PaymentStrategy {
	boolean processPayment(double amount);
    String getMethod();
}
