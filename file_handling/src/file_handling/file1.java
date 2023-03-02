package file_handling;
import java.io.*;

public class file1 {
    public static void main(String[] args) {
        File f = new File("ankith.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File created Successfully");
            } else {
                System.out.println("Cannot create the File");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        FileWriter fwrite =  null;
        try {
            fwrite = new FileWriter(f);
            fwrite.write("My first file");
            fwrite.append(" in java");
            fwrite.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fwrite != null) {
                try {
                    fwrite.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        FileReader fread = null;
        try {
            fread = new FileReader(f);
            int size = (int) f.length();
            char[] data = new char[size];
            fread.read(data);
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fread != null) {
                try {
                    fread.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
