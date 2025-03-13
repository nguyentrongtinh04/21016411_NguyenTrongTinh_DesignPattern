package phan02_Bai02_State;

public class LuxuryTaxState implements TaxState {
    @Override
    public double calculateTax(double price) {
        return price * 0.20; // Thuế xa xỉ 20%
    }

    @Override
    public String getTaxType() {
        return "Thuế xa xỉ (20%)";
    }
}
