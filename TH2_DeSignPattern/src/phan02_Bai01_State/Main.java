package phan02_Bai01_State;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(); 
        System.out.println("Trạng thái hiện tại: " + order.getState());
        order.processOrder(); 

        System.out.println("Trạng thái hiện tại: " + order.getState());
        order.processOrder(); 
        
        System.out.println("Trạng thái hiện tại: " + order.getState());
    }
}
