public class Array {

    static class Student {
        int id;
        String name;
        String course;

        Student(int id, String name, String course) {
            this.id = id;
            this.name = name;
            this.course = course;
            
        }
    } 


    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student(101, "Akhilesh", "MCA");//object creation using parameterized constructor
        students[1] = new Student(102, "Adnan", "MBA");//object creation using parameterized constructor
        students[2] = new Student(103, "Anmol", "BCA");//object creation using parameterized constructor
        students[3] = new Student(104, "Aman", "BBA");//object creation using parameterized constructor
        students[4] = new Student(105, "Amandeep", "M.Tech");//object creation using parameterized constructor
        students[5] = new Student(106, "Anshul", "B.Tech");//object creation using parameterized constructor

        for (Student s : students) {
            System.out.println("ID: " + s.id + ", Name: " + s.name + ", Course: " + s.course);
        }
    
    }
}
class Student {
    int id;
    String name;
    String course;

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
        
    }
    void getInfo(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(course);
    }

}
