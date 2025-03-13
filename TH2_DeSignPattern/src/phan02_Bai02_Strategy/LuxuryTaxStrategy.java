package phan02_Bai02_Strategy;

public class LuxuryTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.20; // Thuế xa xỉ 20%
    }

    @Override
    public String getTaxType() {
        return "Thuế xa xỉ (20%)";
    }
}
