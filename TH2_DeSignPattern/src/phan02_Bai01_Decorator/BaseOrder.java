package phan02_Bai01_Decorator;

public class BaseOrder implements OrderComponent {
    @Override
    public void processOrder() {
        System.out.println("Xử lý đơn hàng: Kiểm tra và xác nhận đơn.");
    }
}
