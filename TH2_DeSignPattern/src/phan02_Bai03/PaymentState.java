package phan02_Bai03;

public interface PaymentState {
	 void handlePayment(PaymentContext context);
	 String getState();
}
