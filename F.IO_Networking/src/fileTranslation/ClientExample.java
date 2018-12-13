package fileTranslation;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientExample {

   static Socket socket = null;
   static OutputStream os = null;
   static InputStream is = null;
   static byte[] bytes = new byte[100];
   static byte[] bytes1 = new byte[100];
   static int readByteCount = 0;
   static String receiveMessage = null;
   static String sendMessage = null;
   
   static void startClient() throws IOException {
      socket = new Socket();
      System.out.println("���� ��û");
      socket.connect(new InetSocketAddress("localhost", 5001));
      System.out.println("���� ����");
      is = socket.getInputStream();
      os = socket.getOutputStream();
   }
   
   static void stopClient() throws IOException {
      is.close();
      os.close();
      socket.close();
   }
   
   public static void main(String[] args) throws IOException {
      ClientExample.startClient();
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
            bytes1 = new byte[100];
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