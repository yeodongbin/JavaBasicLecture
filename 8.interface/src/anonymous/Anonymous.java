package anonymous;

public class Anonymous {

	//필드
	Remote remote = new Remote() {
		@Override
		public void turnOn() {}
		@Override
		public void turnOff() {}
	};
	
	//매서드
	void method() {
		Remote localRemote = new Remote() {
			@Override
			public void turnOn() {}
			@Override
			public void turnOff() {}			
		};
	}
	
	void method2(Remote remote) {
	}
	
	public static void main(String[] args) {
		//변수
		Anonymous anony = new Anonymous();
		anony.remote.turnOn();
		
		Remote remote = new Remote() {
			@Override
			public void turnOn() {}
			@Override
			public void turnOff() {}
		};
		
		//매서드 매개변수
		anony.method2(new Remote() {
			@Override
			public void turnOn() {}
			@Override
			public void turnOff() {}
		});
	}

}
