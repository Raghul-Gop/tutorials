package programs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:/Users/ragopi/Documents/test.txt");
		f.createNewFile();
		FileInputStream fis=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream(f);
		FileWriter fwr=new FileWriter(f);
		fwr.append("rahul");
		fwr.flush();
		fwr.close();
	}

}
