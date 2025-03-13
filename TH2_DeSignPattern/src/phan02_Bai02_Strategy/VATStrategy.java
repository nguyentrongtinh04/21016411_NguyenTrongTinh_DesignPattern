package phan02_Bai02_Strategy;

public class VATStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.10; // Thuế VAT 10%
    }

    @Override
    public String getTaxType() {
        return "Thuế VAT (10%)";
    }
}