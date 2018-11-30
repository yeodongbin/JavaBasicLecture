package class_object;

public class AsuradaExample {

	public static void main(String[] args) {
		Asurada asurada = new Asurada("yeo");
		asurada.PowerOn("yeo");
		asurada.transfer("D");
		asurada.run();
		System.out.println("현재속도 :"+asurada.curSpeed);
		asurada.run();
		asurada.run();
		System.out.println("현재속도 :"+asurada.curSpeed);
		asurada.transfer("D");
		asurada.run();
		asurada.run();
		asurada.run();
		asurada.run();
		System.out.println("현재속도 :"+asurada.curSpeed);
		asurada.transfer("B");
		asurada.booster();
		
//		asurada.PowerOff("yeo");		
//		Asurada enemy = new Asurada("aoi");
//		enemy.PowerOn("aoi");
//		enemy.PowerOff("aoi");	
	}

}
