package condition;
/*
가위 : 0, 바위 : 1, 보 : 2
출력 >>> 나 : 바위  컴 : 가위 결과 : 이겼다. 
*/

public class GBB {
	public static void main(String[] args) {
		int my = 1;
		int com = (int) (Math.random() * 3);

		String myStr = "";
		String comStr = "";
		String resultStr = "";
		int result = (my - com + 2) % 3;

		if(result == 2)
			resultStr = "비겼다";
		else if(result == 1)
			resultStr = "졌다";
		else
			resultStr = "이겼다";

		switch(my) {
			case 0 : myStr = "가위";break;
			case 1 : myStr = "바위";break;
			case 2 : myStr = "보";break;
		}

		switch(com) {
			case 0 : comStr = "가위";break;
			case 1 : comStr = "바위";break;
			case 2 : comStr = "보";break;
		}

		System.out.println("나 : " + myStr + "\t컴 : " + comStr + "\t결과 : " + resultStr);

	}

}
