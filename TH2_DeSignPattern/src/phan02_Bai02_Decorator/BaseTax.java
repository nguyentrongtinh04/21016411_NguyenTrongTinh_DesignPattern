package phan02_Bai02_Decorator;

public class BaseTax extends TaxComponent {
    @Override
    public double calculateTax(double price) {
        return 0; // Mặc định không có thuế
    }

    @Override
    public String getTaxType() {
        return "Không áp dụng thuế";
    }
}
