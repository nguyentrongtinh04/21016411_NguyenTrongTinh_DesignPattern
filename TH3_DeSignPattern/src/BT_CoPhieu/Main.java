package BT_CoPhieu;

public class Main {
	public static void main(String[] args) {
        // Create stock
        Stock appleStock = new Stock("Apple", 150.00);
        
        // Create investors
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");
        
        // Attach investors to stock
        appleStock.attach(investor1);
        appleStock.attach(investor2);
        
        // Change stock price
        System.out.println("Cập nhật giá cổ phiếu...");
        appleStock.setStockPrice(155.75);
        
        System.out.println("Cập nhật giá cổ phiếu lần nữa...");
        appleStock.setStockPrice(160.50);
    }
}