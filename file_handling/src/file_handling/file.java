package file_handling;
import java.io.*;

public class file {
	public static void main(String[] args){
		File f = new File("/home/student/ankith1.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File created Successfully");
			}
			else {
				System.out.println("Cannot create the File");
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		FileWriter fwrite = null;
		try {
			fwrite = new FileWriter(f);
			fwrite.write("My first file");
			fwrite.append("in java");
			fwrite.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fwrite.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		FileReader fread = null;
		try {
			fread = new FileReader(f);
			int size = (int)f.length();
			char[] data = new char[size];
			fread.read(data);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fread.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
