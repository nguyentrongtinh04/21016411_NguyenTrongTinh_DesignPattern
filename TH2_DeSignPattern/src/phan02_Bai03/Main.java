package phan02_Bai03;

public class Main {
    public static void main(String[] args) {
        // Thanh toán bằng thẻ tín dụng có phí xử lý
        PaymentStrategy creditCardWithFee = new ProcessingFeeDecorator(new CreditCardPayment());
        PaymentContext order1 = new PaymentContext(creditCardWithFee);
        order1.processPayment(1000);

        // Thanh toán bằng PayPal có mã giảm giá
        PaymentStrategy paypalWithDiscount = new DiscountDecorator(new PayPalPayment());
        PaymentContext order2 = new PaymentContext(paypalWithDiscount);
        order2.processPayment(2000);

        // Thanh toán bằng tiền mặt
        PaymentContext order3 = new PaymentContext(new CashPayment());
        order3.processPayment(500);
    }
}

