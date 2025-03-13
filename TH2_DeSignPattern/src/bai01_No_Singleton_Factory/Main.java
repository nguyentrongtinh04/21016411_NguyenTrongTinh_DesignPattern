package bai01_No_Singleton_Factory;

public class Main {
    public static void main(String[] args) {
        HighEndGlasses rayBan = new HighEndGlasses("RayBan - Thương hiệu kính nổi tiếng");
        HighEndGlasses gucci = new HighEndGlasses("Gucci - Kính thời trang cao cấp");

        System.out.println(rayBan.getBrand());
        System.out.println(gucci.getBrand());
    }
}

