package phan02_Bai02_State;

public class NoTaxState implements TaxState {
    @Override
    public double calculateTax(double price) {
        return 0; // Không áp dụng thuế
    }

    @Override
    public String getTaxType() {
        return "Miễn thuế";
    }
}