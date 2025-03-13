package phan02_Bai01_Strategy;

public class CancelledStrategy implements OrderStrategy {
    @Override
    public void processOrder() {
        System.out.println("Hủy: Hủy đơn hàng và hoàn tiền.");
    }
}
