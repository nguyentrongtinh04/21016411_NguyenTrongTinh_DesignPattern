package phan02_Bai02_Strategy;

public interface TaxStrategy {
	double calculateTax(double price);
    String getTaxType();
}
