package tryWithResources;

public class FileInputStream implements AutoCloseable{//인터페이스 상속 필수 autocloseable
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file+"을 닫습니다.");
	}
}
