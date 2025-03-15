package BT_Composite;

public class Main {
	public static void main(String[] args) {
        Directory root = new Directory("Goc");
        Directory folder1 = new Directory("TaiLieu");
        Directory folder2 = new Directory("HinhAnh");
        
        File file1 = new File("BaiTap.docx");
        File file2 = new File("Avatar.png");
        
        folder1.add(file1);
        folder2.add(file2);
        
        root.add(folder1);
        root.add(folder2);
        
        root.showInfo();
    }
}
