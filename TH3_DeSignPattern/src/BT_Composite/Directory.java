package BT_Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();
    
    public Directory(String name) {
        this.name = name;
    }
    
    public void add(Component component) {
        children.add(component);
    }
    
    public void remove(Component component) {
        children.remove(component);
    }
    
    @Override
    public void showInfo() {
        System.out.println("Thư mục: " + name);
        for (Component component : children) {
            component.showInfo();
        }
    }
}
