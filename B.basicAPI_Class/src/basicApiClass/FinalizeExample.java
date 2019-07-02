package basicApiClass;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter count = new Counter(1);
		System.out.println(count.no);
		
		count = null;
		//System.out.println(count.no);//gc => �ڵ�����
		System.gc(); //gc ����
	}
}

class Counter {
	int no;
	
	Counter(int no){
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no + "�� ��ü ����");
	}
	
}













