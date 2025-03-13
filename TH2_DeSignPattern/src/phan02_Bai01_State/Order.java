package phan02_Bai01_State;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.handleRequest(this);
    }

    public String getState() {
        return state.getState();
    }
}

