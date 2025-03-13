package bai01_Singleton_Factory;

public class OpticalStore {
    private static OpticalStore instance;

    private OpticalStore() {}

    public static OpticalStore getInstance() {
        if (instance == null) {
            instance = new OpticalStore();
        }
        return instance;
    }

    public void sellGlasses(Glasses glasses) {
        System.out.println("Bán kính: " + glasses.getDescription());
    }
}