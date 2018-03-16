package client_server;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;

		try {
			socket = new Socket();
			System.out.println("Connection Request");

			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("Connection Success");

			byte[] bytes = null;
			String message;
			
			

			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("Data Sending Success");

			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("Data Receive Success : " + message);

			os.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}// main
}
