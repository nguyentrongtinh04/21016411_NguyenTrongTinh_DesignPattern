package phan02_Bai01_Strategy;

public class NewOrderStrategy implements OrderStrategy {
    @Override
    public void processOrder() {
        System.out.println("Mới tạo: Kiểm tra thông tin đơn hàng.");
    }
}

