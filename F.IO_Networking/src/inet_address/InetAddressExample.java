package inet_address;

import java.net.InetAddress;

//IP get
public class InetAddressExample {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local.getHostAddress());

			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress remote : iaArr) {
				System.out.println(remote.getHostAddress());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}
