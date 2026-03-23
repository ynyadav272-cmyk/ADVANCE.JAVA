 public class StudentMain {
    private String name;
    private String course;
    private int sid;

    public StudentMain(String name, String course, int sid) {
        this.name = name;
        this.course = course;
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
class Akhilesh {
    public static void main(String[] args) {
        StudentMain s1 = new StudentMain("Akhilesh", "B.Tech", 12345);
        System.out.println("Name: " + s1.getName());
        System.out.println("Course: " + s1.getCourse());
        System.out.println("SID: " + s1.getSid());
    }
}
