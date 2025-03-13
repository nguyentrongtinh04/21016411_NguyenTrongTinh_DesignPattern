package bai01_Singleton_Factory;

public abstract class Glasses {
    public abstract String getDescription();
}

class Sunglasses extends Glasses {
    @Override
    public String getDescription() {
        return "Kính râm bảo vệ mắt khỏi tia UV";
    }
}

class PrescriptionGlasses extends Glasses {
    @Override
    public String getDescription() {
        return "Kính cận giúp điều chỉnh thị lực";
    }
}

class FashionGlasses extends Glasses {
    @Override
    public String getDescription() {
        return "Kính thời trang giúp tăng phong cách";
    }
}

// Factory Method
abstract class GlassesFactory {
    public abstract Glasses createGlasses();
}

class SunglassesFactory extends GlassesFactory {
    @Override
    public Glasses createGlasses() {
        return new Sunglasses();
    }
}

class PrescriptionGlassesFactory extends GlassesFactory {
    @Override
    public Glasses createGlasses() {
        return new PrescriptionGlasses();
    }
}

class FashionGlassesFactory extends GlassesFactory {
    @Override
    public Glasses createGlasses() {
        return new FashionGlasses();
    }
}
