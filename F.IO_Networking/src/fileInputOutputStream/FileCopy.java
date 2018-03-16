// Copy file

package fileInputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		try {
			InputStream in = new FileInputStream("c:\\test\\test1.txt");
			OutputStream out = new FileOutputStream("c:\\test\\test3.txt");
		
		byte[] buffer = new byte[1024 * 8];

			while (true) {
				int count = in.read(buffer);
				System.out.println(count);

				if (count == -1) {
					break;
				} // End of File (EoF)

				out.write(buffer, 0, count);
			}
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
