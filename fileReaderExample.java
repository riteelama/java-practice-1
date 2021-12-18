package demoClass;

import java.io.*;
public class fileReaderExample {
	public static void main(String [] args) {
		try {
			FileReader f = new FileReader("C:\\Users\\hp\\Desktop\\New Text Document.txt");
			FileWriter w = new FileWriter("C:\\Users\\hp\\Desktop\\test.txt");
			int c;
			while((c=f.read())!=-1) {
				w.write(c);
				
			}
			f.close();
			w.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("file copied");
	}
}
