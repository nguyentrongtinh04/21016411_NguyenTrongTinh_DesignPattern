package phan02_Bai01_Strategy;

public class ProcessingStrategy implements OrderStrategy {
    @Override
    public void processOrder() {
        System.out.println("Đang xử lý: Đóng gói và vận chuyển.");
    }
}
