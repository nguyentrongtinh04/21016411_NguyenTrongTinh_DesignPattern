package phan02_Bai01_State;

public class DeliveredState implements OrderState {
    @Override
    public void handleRequest(Order order) {
        System.out.println("Đã giao: Cập nhật trạng thái đơn hàng là đã giao.");
        // Không có trạng thái tiếp theo
    }

    @Override
    public String getState() {
        return "Đã giao";
    }
}
