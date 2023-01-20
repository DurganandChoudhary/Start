package jan20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		
		FileReader fr = new FileReader("C:\\Users\\hp\\Desktop");
		
		int i;
		
		
		while((i = fr.read())!=-1)
			System.out.println((char)i);
		fr.close();

	}

}
