package smartPhone;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone("삼성", "갤럭시노트2", 850000);
		SmartPhone sp2 = new SmartPhone("애플", "아이폰7", 870000, 30);
		SmartPhone sp3 = new SmartPhone("삼성", "갤럭시S3", 730000, 35);

		System.out.println("==== 제품목록 ====");
		System.out.println(sp1.getName() + "[" + sp1.getMaker() + "]");
		System.out.println("가격 : " + sp1.getPrice() + "원");
		if(sp1.getDiscountRate() != 0)
			System.out.println("할인가격 : " + sp1.calculateDiscount() + "원");
		System.out.println("----------------------------------");
		System.out.println(sp2.getName() + "[" + sp2.getMaker() + "]");
		System.out.println("가격 : " + sp2.getPrice() + "원");
		if(sp2.getDiscountRate() != 0)
			System.out.println("할인가격 : " + sp2.calculateDiscount() + "원");
		System.out.println("----------------------------------");
		System.out.println(sp3.getName() + "[" + sp3.getMaker() + "]");
		System.out.println("가격 : " + sp3.getPrice() + "원");
		if(sp3.getDiscountRate() != 0)
			System.out.println("할인가격 : " + sp3.calculateDiscount() + "원");
		System.out.println("----------------------------------");
	}
}
