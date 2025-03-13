package phan02_Bai01_State;

public interface OrderState {
    void handleRequest(Order order);
    String getState();
}
