package mkyong.JavaIO;

import java.io.File;
import java.io.IOException;

public class ConstructFilePath {

	public static void main(String[] args) throws IOException {
		
		String fileName = "file2.txt";
		String workingDir = System.getProperty("user.dir");
//		String obsolutePath = workingDir + File.separator + fileName;
		
		File file = new File( workingDir, fileName);
		
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File is already existed!");
		}
//		System.out.println(obsolutePath);
		
	}

}
