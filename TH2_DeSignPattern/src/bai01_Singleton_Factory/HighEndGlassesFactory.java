package bai01_Singleton_Factory;

public class HighEndGlassesFactory {
    public static HighEndGlasses createGlasses(String brand) {
        switch (brand.toLowerCase()) {
            case "rayban":
                return new RayBanGlasses();
            case "gucci":
                return new GucciGlasses();
            default:
                throw new IllegalArgumentException("Không hỗ trợ thương hiệu này: " + brand);
        }
    }
}