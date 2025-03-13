package phan02_Bai01_State;

public class CancelledState implements OrderState {
    @Override
    public void handleRequest(Order order) {
        System.out.println("Hủy: Hủy đơn hàng và hoàn tiền.");
        // Không có trạng thái tiếp theo
    }

    @Override
    public String getState() {
        return "Hủy";
    }
}
