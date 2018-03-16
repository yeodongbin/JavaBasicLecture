package fileInputOutputStream;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;

public class FileExample {

	public static void main(String[] args) {
		try {
			File dir = new File("c:/test");
			File file1 = new File("c:/test/test1.txt");
			File file2 = new File(new URI("file:///C:/test/test2.txt"));
			
			if (dir.exists() == false) { 	dir.mkdirs();		}
			
			if (file1.exists() == false) { 	file1.createNewFile();		}
			
			if (file2.exists() == false) { 	file2.createNewFile();		}
			
			File temp = new File("c:/test");
			File[] contents = temp.listFiles();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd a hh:mm");
			
			System.out.println("날짜\t 시간\t   형태\t크기\t이름");
			
			for(File file : contents) {
				System.out.print(sdf.format(file.lastModified()));
				
				if (file.isDirectory()) {
					System.out.print(" <DIR>\t\t"+file.getName());
				} else if (file.isFile()){
					System.out.print("\t"+file.length() + "\t" + file.getName());
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}