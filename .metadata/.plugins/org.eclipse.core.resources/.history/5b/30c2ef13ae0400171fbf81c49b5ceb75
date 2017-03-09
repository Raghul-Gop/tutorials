package programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\abc.txt");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("username");
		System.out.println(s);
		p.setProperty("role", "administrator");
		FileOutputStream fout=new FileOutputStream("C:\\abc.txt");
		p.store(fout, "Modified by Properties Demo program");
	}

}
