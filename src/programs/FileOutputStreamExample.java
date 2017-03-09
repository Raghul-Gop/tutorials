package programs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="rahul is a good boy";
		File f=new File("C:/Users/ragopi/Documents/demo.txt");
		if(!f.exists()){
			f.createNewFile();
		}
		FileOutputStream fos=new FileOutputStream(f);
		byte[] content=s.getBytes();
		fos.write(content);
		fos.flush();
		fos.close();
	}

}
