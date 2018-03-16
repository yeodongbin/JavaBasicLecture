package inheritance;

public class StarCraft {
	public static void main(String[] args) {
		Marine my = new Marine();
		Marine com = new Marine();

		//내체력	  컴체력
		//체력 : 100  체력 : 100
		System.out.println(my + "\t" + com);
		System.out.println("내가 컴을 2회 공격!!!!");
		for(int i=0;i<2;i++)
			my.attack(com);
		//체력 : 100  체력 : 80
		System.out.println(my + "\t" + com);
		System.out.println("컴이 나를 6회 공격!!!!");
		for(int i=0;i<6;i++)
			com.attack(my);
		//체력 : 40  체력 : 80
		System.out.println(my + "\t" + com);
		System.out.println("내가 컴을 4회 공격!!!!");
		for(int i=0;i<4;i++)
			my.attack(com);
		//체력 : 40  체력 : 40
		System.out.println(my + "\t" + com);
		System.out.println("내마린을 흥분모드로 변경");
		my.setMode(1);
		//체력 : 15  체력 : 40
		System.out.println(my + "\t" + com);
		System.out.println("내가 컴을 1회 공격!!!!");
		my.attack(com);
		//체력 : 15  체력 : 15
		System.out.println(my + "\t" + com);
		System.out.println("내마린을 흥분모드로 변경");
		my.setMode(1);
		//체력이 30이하이므로 모드변경 불가능.
		System.out.println(my + "\t" + com);

		System.out.println("내가 컴을 1회 공격!!!!");
		my.attack(com);
		//체력 : 15  체력 : die
		System.out.println(my + "\t" + com);


		my.setMode(1);
		//체력 : 15  체력 : 40
		System.out.println(my + "\t" + com);
	}
}
