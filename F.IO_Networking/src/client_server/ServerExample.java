package client_server;

import java.io.*;
import java.net.*;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket();// 연결
			serverSocket.bind(new InetSocketAddress("localhost", 5001));

			while (true) {
				System.out.println("waiting connection");

				Socket socket = serverSocket.accept();// 연결수락
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();//

				System.out.println("Server IP Address : " + isa.getHostName());
				System.out.println("Server Port Number : " + isa.getPort());
				System.out.println("Server IP - Port Number : " + isa.toString());

				byte[] bytes = null;
				String message = null;

				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("Data Receive Sccess (Server -> Client) : " + message);

				OutputStream os = socket.getOutputStream();
				message = "Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("데이터 보내기 성공");

				is.close();
				os.close();
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e1) {
			}
		}

	}// main
}
