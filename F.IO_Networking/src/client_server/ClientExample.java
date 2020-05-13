package client_server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;

		try {
			socket = new Socket();
			System.out.println("Connection Request");

			socket.connect(new InetSocketAddress("192.168.0.139", 5001));
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
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}// main
}
