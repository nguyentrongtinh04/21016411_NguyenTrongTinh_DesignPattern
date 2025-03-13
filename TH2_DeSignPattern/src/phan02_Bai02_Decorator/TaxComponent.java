package phan02_Bai02_Decorator;

public abstract class TaxComponent {
    public abstract double calculateTax(double price);
    public abstract String getTaxType();
}
