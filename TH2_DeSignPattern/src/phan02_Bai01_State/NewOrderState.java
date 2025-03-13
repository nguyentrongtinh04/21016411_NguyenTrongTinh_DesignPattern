package phan02_Bai01_State;

public class NewOrderState implements OrderState {
    @Override
    public void handleRequest(Order order) {
        System.out.println("Mới tạo: Kiểm tra thông tin đơn hàng.");
        order.setState(new ProcessingState()); // Chuyển sang trạng thái tiếp theo
    }

    @Override
    public String getState() {
        return "Mới tạo";
    }
}