package fileInputOutputStream;

import java.io.*; // Accessing FileReader, FileWriter, IOException 

public class CharByteStream {
	public static void main(String[] args) throws IOException {
		charRead();
		streamRead();
	}

	public static void charRead() throws IOException {
		FileReader sourceStream = null;
		try {
			sourceStream = new FileReader("test.txt");

			// Reading sourcefile and writing content to
			// target file character by character.
			int temp;
			while ((temp = sourceStream.read()) != -1) {
				System.out.println((char) temp);
			}
		} finally {
			// Closing stream as no longer in use
			if (sourceStream != null)
				sourceStream.close();
		}
	}

	public static void streamRead() throws IOException {
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;

		try {
			sourceStream = new FileInputStream("sorcefile.txt");
			targetStream = new FileOutputStream("targetfile.txt");

			// Reading source file and writing content to target
			// file byte by byte
			int temp;
			while ((temp = sourceStream.read()) != -1) {
				targetStream.write((byte) temp);
			}
		} finally {
			if (sourceStream != null)
				sourceStream.close();
			if (targetStream != null)
				targetStream.close();
		}
	}
}
