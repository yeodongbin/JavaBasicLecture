package basicApiClass;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter count = new Counter(1);
		System.out.println(count.no);
		
		count = null;
		//System.out.println(count.no);//gc => 자동삭제
		System.gc(); //gc 동작
	}
}

class Counter {
	int no;
	
	Counter(int no){
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no + "번 객체 삭제");
	}
	
}













