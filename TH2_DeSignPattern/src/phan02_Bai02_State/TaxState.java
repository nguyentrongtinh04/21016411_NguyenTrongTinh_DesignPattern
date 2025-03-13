package phan02_Bai02_State;

public interface TaxState {
	double calculateTax(double price);
    String getTaxType();
}
