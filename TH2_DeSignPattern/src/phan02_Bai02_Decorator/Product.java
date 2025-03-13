package phan02_Bai02_Decorator;

public class Product {
    private String name;
    private double price;
    private TaxComponent taxComponent;

    public Product(String name, double price, TaxComponent taxComponent) {
        this.name = name;
        this.price = price;
        this.taxComponent = taxComponent;
    }

    // Tính tổng thuế
    public double calculateTotalTax() {
        return taxComponent.calculateTax(price);
    }

    // Tính giá sau thuế
    public double getFinalPrice() {
        return price + calculateTotalTax();
    }

    public void displayInfo() {
        System.out.println("Sản phẩm: " + name);
        System.out.println("Giá gốc: " + price);
        System.out.println("Loại thuế áp dụng: " + taxComponent.getTaxType());
        System.out.println("Thuế: " + calculateTotalTax());
        System.out.println("Giá sau thuế: " + getFinalPrice());
        System.out.println("--------------------------------------");
    }
}
