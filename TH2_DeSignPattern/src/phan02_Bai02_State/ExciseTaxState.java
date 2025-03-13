package phan02_Bai02_State;

public class ExciseTaxState implements TaxState {
    @Override
    public double calculateTax(double price) {
        return price * 0.15; // Thuế tiêu thụ đặc biệt 15%
    }

    @Override
    public String getTaxType() {
        return "Thuế tiêu thụ đặc biệt (15%)";
    }
}
