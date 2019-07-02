package basicApiClass;

public class SystemExample {

	public static void main(String[] args) {
//		System.out.println("hong");
		//long time = System.nanoTime(); 
		long time = System.currentTimeMillis();//1000 => 1√ 
		
		for (int i = 0; i < 1000000 ; i++) {
			if (i != 5) {
			System.out.println(i);
			} else {
			//	System.exit(0);
			}
		}
		//long time2 = System.nanoTime();
		long time2 = System.currentTimeMillis();
		
		//System.out.println(time2-time);
		String userName = System.getProperty("user.name"); 
		String userDir  = System.getProperty("user.dir"); 
		
		System.out.println(userName);
		System.out.println(userDir);
	}
}















