import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class file2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java file2 <source-image> <target>");
            System.exit(1);
        }
        Path src = Paths.get(args[0]);
        Path dst = Paths.get(args[1]);
        try {
            if (!Files.exists(src) || !Files.isRegularFile(src)) {
                System.err.println("Source file does not exist or is not a regular file: " + src);
                System.exit(3);
            }
            Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copied " + src + " -> " + dst);
        } catch (IOException e) {
            System.err.println("Copy failed: " + e.getMessage());
            System.exit(2);
        }
    }
}
