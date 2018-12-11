package fileInputOutputStream;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		String filePath = "c:/test/test1.txt";
		
		/*
		File file = new File(filePath);
		
		try (FileInputStream fis = new FileInputStream(file)){
		*/
		
		try (FileInputStream fis = new FileInputStream(filePath)){	
			int data;
			while ((data = fis.read()) != -1) { //읽는 값이 없을때
				System.out.print((char)data);
			}
			//fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
