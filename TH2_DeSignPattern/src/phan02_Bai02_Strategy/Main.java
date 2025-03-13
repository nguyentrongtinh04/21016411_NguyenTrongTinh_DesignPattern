package phan02_Bai02_Strategy;

public class Main {
    public static void main(String[] args) {
        // Sản phẩm không bị đánh thuế
        Product book = new Product("Sách giáo khoa", 100, new NoTaxStrategy());
        book.displayInfo();

        // Sản phẩm có thuế VAT
        Product laptop = new Product("Laptop", 2000, new VATStrategy());
        laptop.displayInfo();

        // Sản phẩm có thuế tiêu thụ đặc biệt
        Product beer = new Product("Bia", 50, new ExciseTaxStrategy());
        beer.displayInfo();

        // Sản phẩm xa xỉ có thuế cao
        Product rolex = new Product("Đồng hồ Rolex", 10000, new LuxuryTaxStrategy());
        rolex.displayInfo();

        // Thay đổi chiến lược thuế của sản phẩm
        System.out.println("🔄 Cập nhật thuế cho laptop từ VAT sang tiêu thụ đặc biệt:");
        laptop.setTaxStrategy(new ExciseTaxStrategy());
        laptop.displayInfo();
    }
}
