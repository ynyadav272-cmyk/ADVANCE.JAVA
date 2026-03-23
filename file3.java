import java.io.FileInputStream;

public class file3 {
    public static void main(String args[]){

        FileInputStream fis = null;
        try {
            fis= new FileInputStream("D:\\test.txt");
            int i;
            while((i=fis.read()) != -1){
                System.out.print((char)i);
            }

        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                System.out.println("Exception caught while closing: " + e.getMessage());

            }
        }
            
        }
    }