package inheritance;

public class TaxiUser {
	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		int km = 25;
		System.out.println("구디에서 강남까지 " + km + "km이동!!!!");
		int price = taxi.calcPrice(km);
		//25km 이동시 요금 : 5500원
		System.out.println(km + "km 이동시 요금 : " + price);
		//금일 누적요금 : 5500원
		System.out.println("금일 누적요금 : " + taxi.totalPrice);

		km = 25;
		System.out.println("강남에서 구디까지 " + km + "km이동!!!!");
		price = taxi.calcPrice(km);
		//25km 이동시 요금 : 5500원
		System.out.println(km + "km 이동시 요금 : " + price);
		//금일 누적요금 : 11000원
		System.out.println("금일 누적요금 : " + taxi.totalPrice);

		//현대에서 만든 검정색 소나타택시
		System.out.println(taxi.maker + "에서 만든 " + 
			taxi.carColor + " " + taxi.carName + "택시");

		taxi.speedUp();
		System.out.println("택시 속도 : " + taxi.speed);

	//	taxi.initPrice(50);


		//삼성에서 만든 감홍색 SM6택시
		Taxi taxi2 = new Taxi("SM6", "감홍색", "삼성");
		//System.out.println(taxi2.maker + "에서 만든 " + 
		//	taxi2.carColor + " " + taxi2.carName + "택시");
		System.out.println(taxi2.toString());
		System.out.println(taxi.toString() + "\t" + 
			taxi2.toString());

		System.out.println(taxi.hashCode() + "\t" + 
			taxi2.hashCode());

		Taxi taxi3 = new Taxi("SM6", "감홍색", "삼성");
		/*
		기DT == 기DT : 값비교
		참DT == 참DT : 주소값비교
		*/
		if(taxi2 == taxi3) 
			System.out.println("taxi2와 taxi3는 주소값이 같은 택시이다.");
		else
			System.out.println("taxi2와 taxi3는 주소값이 다른 택시이다.");

		if(taxi2.equals(taxi3)) 
			System.out.println("taxi2와 taxi3는 차이름이 같은 택시이다.");
		else
			System.out.println("taxi2와 taxi3는 차이름이 다른 택시이다.");


		System.out.println("taxi의 속도를 40회 증가");
		for(int i=0;i<40;i++)
			taxi.speedUp();
		System.out.println("taxi의 속도 : " + taxi.speed);
	}
}
