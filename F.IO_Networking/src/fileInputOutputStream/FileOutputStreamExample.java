package fileInputOutputStream;

import java.io.*;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		String filePath = "c:/test/test1.txt";
		String fileOutputPath = "c:/test/test3.txt";

		try (FileInputStream fis = new FileInputStream(filePath);
				FileOutputStream fos = new FileOutputStream(fileOutputPath)){

			int readByteNo;
			byte[] readBytes = new byte[1024];
			while ((readByteNo = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteNo);
			}
			fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} 

		

	}

}
