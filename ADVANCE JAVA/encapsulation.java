class Employee{
    private int id;
    
    public void setId(int i) {
        id = i;
    }
    public int getId() {
        return id;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        
       Employee e1 = new Employee();
       e1.setId(45);
    
       System.out.println("id="+e1.getId());
       System.out.println(e1.getId());
    }

    
}
