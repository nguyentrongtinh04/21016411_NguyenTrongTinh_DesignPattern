package phan02_Bai02_State;

public class VATState implements TaxState {
    @Override
    public double calculateTax(double price) {
        return price * 0.10; // Thuế VAT 10%
    }

    @Override
    public String getTaxType() {
        return "Thuế VAT (10%)";
    }
}
