package bai01_Singleton_Factory;

public class Main {
    public static void main(String[] args) {
        HighEndGlasses rayBan = HighEndGlassesFactory.createGlasses("RayBan");
        System.out.println(rayBan.getBrand());

        HighEndGlasses gucci = HighEndGlassesFactory.createGlasses("Gucci");
        System.out.println(gucci.getBrand());
    }
}