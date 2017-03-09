package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SymantecPreparationFileReadAndWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("C:\\Users\\ragopi\\Desktop\\1476706967043.txt");
		FileInputStream fis=new FileInputStream(f);
		File newFile=new File("C:\\Users\\ragopi\\Desktop\\DynamicallyCreatedFileByJava.txt");
		if(!newFile.exists()){
			
		}
		FileOutputStream fout=new FileOutputStream(newFile);
		int c;
		while((c=fis.read())!=-1){
			System.out.print((char)c);
			fout.write((char)c);
		}
		fis.close();
		fout.flush();
		fout.close();
	}

}
