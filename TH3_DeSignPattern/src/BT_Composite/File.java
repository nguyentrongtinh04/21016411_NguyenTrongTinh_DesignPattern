package BT_Composite;

public class File implements Component {
    private String name;
    
    public File(String name) {
        this.name = name;
    }
    
    @Override
    public void showInfo() {
        System.out.println("Tập tin: " + name);
    }
}