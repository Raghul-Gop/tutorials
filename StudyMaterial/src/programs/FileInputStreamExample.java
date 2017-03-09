package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int content;
		File f=new File("C:/Users/ragopi/Documents/demo.txt");
		FileInputStream fis;
		if(f.exists()){
		fis=new FileInputStream(f);
		while((content=fis.read())!=-1){
			System.out.print((char)content);
		}
		}else{
			System.out.println("File not found");		}
		
	}

}
