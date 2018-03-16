package tryWithResources;

public class TryWithResourceExample {
public static void main(String[] args) {
	try (FileInputStream fis = new FileInputStream("file.txt")){
		fis.read();
		throw new Exception(); //강제 예외 발생 -> 예외처리전에 close() 발생
		
	} catch (Exception e) {
		System.out.println("에외 처리 코드가 실행되었습니다.");
		
	}
}
}
