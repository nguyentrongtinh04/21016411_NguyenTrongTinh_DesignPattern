package phan02_Bai02_Decorator;

public abstract class TaxDecorator extends TaxComponent {
    protected TaxComponent baseTax;

    public TaxDecorator(TaxComponent baseTax) {
        this.baseTax = baseTax;
    }

    @Override
    public double calculateTax(double price) {
        return baseTax.calculateTax(price);
    }

    @Override
    public String getTaxType() {
        return baseTax.getTaxType();
    }
}
