package phan02_Bai01_Strategy;

public class DeliveredStrategy implements OrderStrategy {
    @Override
    public void processOrder() {
        System.out.println("Đã giao: Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
