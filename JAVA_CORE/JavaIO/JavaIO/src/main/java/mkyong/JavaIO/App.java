package mkyong.JavaIO;

import java.io.File;
import java.io.IOException;

/**
 * Java IO
 *
 */
public class App{
    public static void main( String[] args ){
        /**
         * createNewFile()
         */
    	try {
			createNewFile("file.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	/**
    	 * 
    	 */
    }
    
    public static Boolean createNewFile(String filePath) throws IOException{
    	File file = new File(filePath);
    	Boolean result = file.createNewFile();
    	if (result){
    		println("File is created successfully!");
    	}else{
    		println("File already exists!");
    	}
		return null;
    }
    
    public static void println(String info){
    	System.out.println(info);
    }
}
