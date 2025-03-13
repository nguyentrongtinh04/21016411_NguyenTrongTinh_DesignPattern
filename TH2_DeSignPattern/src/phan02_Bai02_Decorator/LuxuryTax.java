package phan02_Bai02_Decorator;

public class LuxuryTax extends TaxDecorator {
    public LuxuryTax(TaxComponent baseTax) {
        super(baseTax);
    }

    @Override
    public double calculateTax(double price) {
        return baseTax.calculateTax(price) + price * 0.20;
    }

    @Override
    public String getTaxType() {
        return baseTax.getTaxType() + " + Thuế xa xỉ (20%)";
    }
}
