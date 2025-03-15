package BT_DuAn;

public class Main {
	public static void main(String[] args) {
        // Create task
        Task projectTask = new Task("Thiết kế UI", "Chưa bắt đầu");
        
        // Create team members
        TeamMember member1 = new TeamMember("Alice");
        TeamMember member2 = new TeamMember("Bob");
        
        // Attach team members to task
        projectTask.attach(member1);
        projectTask.attach(member2);
        
        // Change task status
        System.out.println("Cập nhật trạng thái công việc...");
        projectTask.setStatus("Đang thực hiện");
        
        System.out.println("Cập nhật trạng thái công việc lần nữa...");
        projectTask.setStatus("Hoàn thành");
    }
}
