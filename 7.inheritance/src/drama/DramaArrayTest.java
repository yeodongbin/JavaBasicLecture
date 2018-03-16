package drama;

public class DramaArrayTest {

	public static void main(String[] args) {
		TVProgram tvp[] = new TVProgram[4];
		tvp[0] = new Drama("그겨울", "SBS", "김규태", "조인성", "송혜교");
		tvp[1] = new Drama("백년", "MBC", "주유수", "진구", null);
		tvp[2] = new Drama("아이리스", "KBS", "표민수", "장혁", "이다해");
		tvp[3] = new Drama("최고다", "KBS", "윤성식", null, "아이유");

		int len = tvp.length;
		for (int i = 0; i < len; i++) {
			System.out.println(tvp[i]);
		}
	}
}
