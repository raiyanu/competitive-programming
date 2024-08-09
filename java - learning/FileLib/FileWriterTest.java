package FileLib;

import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";
        File file = new File(fileName);
        if (!file.exists()) {
            FileWriter fw = new FileWriter("test.txt");
            fw.close();
        }
        FileReader fr = new FileReader(fileName);
        int data = fr.read();
        System.out.println("File content:");
        while (data != -1) {
            System.out.print((char)data);
            data = fr.read();
        }
        System.out.println("\n");
        fr.close();
    }
}
