package phan02_Bai02_Decorator;

public class ExciseTax extends TaxDecorator {
    public ExciseTax(TaxComponent baseTax) {
        super(baseTax);
    }

    @Override
    public double calculateTax(double price) {
        return baseTax.calculateTax(price) + price * 0.15;
    }

    @Override
    public String getTaxType() {
        return baseTax.getTaxType() + " + Thuế tiêu thụ đặc biệt (15%)";
    }
}
