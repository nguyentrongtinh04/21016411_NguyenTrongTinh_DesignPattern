package phan02_Bai02_State;

public class Main {
    public static void main(String[] args) {
        // Sản phẩm không bị đánh thuế
        Product book = new Product("Kính mát", 100, new NoTaxState());
        book.displayInfo();

        // Sản phẩm có thuế VAT
        Product laptop = new Product("Kính râm", 2000, new VATState());
        laptop.displayInfo();

        // Sản phẩm có thuế tiêu thụ đặc biệt
        Product beer = new Product("Kính cận", 50, new ExciseTaxState());
        beer.displayInfo();

        // Sản phẩm xa xỉ có thuế cao
        Product rolex = new Product("Kính model", 10000, new LuxuryTaxState());
        rolex.displayInfo();

        // Thay đổi trạng thái thuế của sản phẩm
        System.out.println("🔄 Cập nhật thuế cho laptop từ VAT sang tiêu thụ đặc biệt:");
        laptop.setTaxState(new ExciseTaxState());
        laptop.displayInfo();
    }
}
