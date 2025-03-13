package phan02_Bai02_Decorator;

public class VATTax extends TaxDecorator {
    public VATTax(TaxComponent baseTax) {
        super(baseTax);
    }

    @Override
    public double calculateTax(double price) {
        return baseTax.calculateTax(price) + price * 0.10;
    }

    @Override
    public String getTaxType() {
        return baseTax.getTaxType() + " + VAT (10%)";
    }
}
