package tryWithResources;

public class TryWithResourceExample {
public static void main(String[] args) {
	try (FileInputStream fis = new FileInputStream("file.txt")){
		fis.read();
		throw new Exception(); //���� ���� �߻� -> ����ó������ close() �߻�
		
	} catch (Exception e) {
		System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		
	}
}
}
