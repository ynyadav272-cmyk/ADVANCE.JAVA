import java.util.Arrays;
import java.util.List;
public class MainRecord {  

record Student(int sid, String name, String course) {};
    public static void main(String[] args){
       int data[] = new int[] {1, 2, 3, 4, 5};
            List<Integer> listData = Arrays.stream(data).boxed().toList();
            //listData.forEach(item -> System.out.println(item));
            listData.forEach(System.out::println);
            
        Student student1 = new Student(1, "Akhilesh", "MCA");
        System.out.println(student1);
        System.out.println(student1.sid());
        System.out.println(student1.name());
        System.out.println(student1.course());
        System.out.println(student1.hashCode());

    }
}
