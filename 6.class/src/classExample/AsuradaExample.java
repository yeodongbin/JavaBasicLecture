package classExample;

public class AsuradaExample {

	public static void main(String[] args) {
		Asurada asurada = new Asurada("yeo");
		asurada.powerOn();
		asurada.transfer("D");
		asurada.run();
		System.out.println("����ӵ� :"+asurada.curSpeed);
		asurada.run();
		asurada.run();
		System.out.println("����ӵ� :"+asurada.curSpeed);
		asurada.transfer("D");
		asurada.run();
		asurada.run();
		asurada.run();
		asurada.run();
		System.out.println("����ӵ� :"+asurada.curSpeed);
		asurada.transfer("B");
		
		
//		asurada.PowerOff("yeo");		
//		Asurada enemy = new Asurada("aoi");
//		enemy.PowerOn("aoi");
//		enemy.PowerOff("aoi");	
	}

}
