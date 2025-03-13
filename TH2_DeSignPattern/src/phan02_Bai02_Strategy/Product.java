package phan02_Bai02_Strategy;

public class Product {
    private String name;
    private double price;
    private TaxStrategy taxStrategy;

    public Product(String name, double price, TaxStrategy taxStrategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    // Thay đổi chiến lược tính thuế
    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    // Tính tổng thuế
    public double calculateTax() {
        return taxStrategy.calculateTax(price);
    }

    // Tính giá sau thuế
    public double getFinalPrice() {
        return price + calculateTax();
    }

    public void displayInfo() {
        System.out.println("Sản phẩm: " + name);
        System.out.println("Giá gốc: " + price);
        System.out.println("Loại thuế áp dụng: " + taxStrategy.getTaxType());
        System.out.println("Thuế: " + calculateTax());
        System.out.println("Giá sau thuế: " + getFinalPrice());
        System.out.println("--------------------------------------");
    }
}
