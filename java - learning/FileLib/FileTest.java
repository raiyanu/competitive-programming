package FileLib;

import java.io.File;

// FileLibDB db = new FileLibDB();
// db.greet();
public class FileTest {
    public static void main(String[] args) {
        System.out.println("===================================\n\n\n");

        File file = new File("TestFile.txt");

        if (file.exists()) {
            System.out.println("File exists");
            System.out.println(file.length());
            System.out.println(file.getName());
            
        } else {
            System.out.println("File does not exist");
        }
    }
}
