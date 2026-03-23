import java.io.*;

public class fileclass {
    public static void main(String args[]) {

        final fileclass f = new fileclass();
        System.out.println(f.exits());
        try {
            if (f.createNewfileclass()) {
                System.out.println("file created successfully");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(f.exits());

    }

    public boolean createNewfileclass() throws IOException {
        File file = new File("myfile.txt");
        return file.createNewFile();
    }

    public boolean exits() {
        File file = new File("myfile.txt");
        return file.exists();

    }
}
