package problems;

public class Pro9 {

	public static void main(String[] args) {
		SelectNo sn = null;
		
		switch(1) {
		case 1:
			sn = SelectNo.STUDENTNUM;break;
		case 2:
		case 3:
		
		}
		
		System.out.println(sn);
		
		if (sn == SelectNo.STUDENTNUM) {
			System.out.println("good");
		}
	}

}

enum SelectNo {
	STUDENTNUM,
	SCORESINPUT,
	SCORESJLIST,
	ANALYSIS,
	EXIT
}
