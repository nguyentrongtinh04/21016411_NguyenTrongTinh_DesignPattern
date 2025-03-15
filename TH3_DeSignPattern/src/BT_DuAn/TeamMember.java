package BT_DuAn;

public class TeamMember implements Observer {
    private String name;
    
    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String status) {
        System.out.println(name + " nhận thông báo: Trạng thái công việc '" + taskName + "' đã thay đổi thành '" + status + "'.");
    }
}