package phan02_Bai01_State;

public class ProcessingState implements OrderState {
    @Override
    public void handleRequest(Order order) {
        System.out.println("Đang xử lý: Đóng gói và vận chuyển.");
        order.setState(new DeliveredState()); // Chuyển sang trạng thái tiếp theo
    }

    @Override
    public String getState() {
        return "Đang xử lý";
    }
}