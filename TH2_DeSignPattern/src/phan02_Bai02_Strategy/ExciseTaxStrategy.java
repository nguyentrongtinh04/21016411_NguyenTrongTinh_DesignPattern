package phan02_Bai02_Strategy;

public class ExciseTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.15; // Thuế tiêu thụ đặc biệt 15%
    }

    @Override
    public String getTaxType() {
        return "Thuế tiêu thụ đặc biệt (15%)";
    }
}