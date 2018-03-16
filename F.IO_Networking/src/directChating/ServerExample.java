package directChating;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerExample {
   static ServerSocket serverSocket = null;
   static Socket socket = null;
   static InetSocketAddress isa = null;
   static InputStream is = null;
   static OutputStream os = null;
   static byte[] bytes = new byte[100];
   static byte[] bytes1 = new byte[100];
   static int readByteCount = 0;
   static String receiveMessage = null;
   static String sendMessage = null;
   
   static void startServer() throws IOException {
      serverSocket = new ServerSocket();
      serverSocket.bind(new InetSocketAddress("192.168.18.110", 5001));
      System.out.println("���� ���");
      socket = serverSocket.accept();
      isa = (InetSocketAddress)socket.getRemoteSocketAddress();
      System.out.println("���� ����" + isa.getHostName());
      is = socket.getInputStream();
      os = socket.getOutputStream();
   }
   
   static void stopServer() throws IOException {
      os.close();
      is.close();
      socket.close();   
      serverSocket.close();
   }

   
   public static void main(String[] args) throws IOException {
      ServerExample.startServer();
      receiveMessage = null;
      sendMessage = null;
      while(true) {
         if(is.available() != 0) {
            bytes = new byte[100];
            readByteCount = is.read(bytes);
            receiveMessage = new String(bytes, 0, readByteCount, "UTF-8");
            System.out.print("���� �޼��� : " + receiveMessage);
         }
         
         if(System.in.available() != 0) {
            bytes = new byte[100];
            int length = System.in.read(bytes1);
            if(length != -1 && length != 0)
            {
               sendMessage = new String(bytes1, 0, length);
               os.write(sendMessage.getBytes("UTF-8"));
               os.flush();
            }
         }
      }
   }
}