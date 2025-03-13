package phan02_Bai02_Strategy;

public class NoTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return 0; // Không áp dụng thuế
    }

    @Override
    public String getTaxType() {
        return "Miễn thuế";
    }
}

