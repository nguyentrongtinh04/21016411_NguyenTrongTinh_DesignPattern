package phan02_Bai02_Decorator;

public class Main {
    public static void main(String[] args) {
        // Sản phẩm không có thuế
        Product book = new Product("Sách giáo khoa", 100, new BaseTax());
        book.displayInfo();

        // Sản phẩm có thuế VAT
        Product laptop = new Product("Laptop", 2000, new VATTax(new BaseTax()));
        laptop.displayInfo();

        // Sản phẩm có thuế tiêu thụ đặc biệt
        Product beer = new Product("Bia", 50, new ExciseTax(new BaseTax()));
        beer.displayInfo();

        // Sản phẩm xa xỉ có thuế cao
        Product rolex = new Product("Đồng hồ Rolex", 10000, new LuxuryTax(new VATTax(new BaseTax())));
        rolex.displayInfo();

        // Kết hợp nhiều loại thuế
        Product whiskey = new Product("Rượu Whisky", 500, new ExciseTax(new LuxuryTax(new VATTax(new BaseTax()))));
        whiskey.displayInfo();
    }
}
