package phan02_Bai02_State;

public class Product {
    private String name;
    private double price;
    private TaxState taxState;

    public Product(String name, double price, TaxState taxState) {
        this.name = name;
        this.price = price;
        this.taxState = taxState;
    }

    // Thay đổi trạng thái thuế của sản phẩm
    public void setTaxState(TaxState taxState) {
        this.taxState = taxState;
    }

    // Tính tổng thuế
    public double calculateTax() {
        return taxState.calculateTax(price);
    }

    // Tính giá sau thuế
    public double getFinalPrice() {
        return price + calculateTax();
    }

    public void displayInfo() {
        System.out.println("Sản phẩm: " + name);
        System.out.println("Giá gốc: " + price);
        System.out.println("Loại thuế áp dụng: " + taxState.getTaxType());
        System.out.println("Thuế: " + calculateTax());
        System.out.println("Giá sau thuế: " + getFinalPrice());
        System.out.println("--------------------------------------");
    }
}
