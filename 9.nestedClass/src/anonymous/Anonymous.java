package anonymous;

public class Anonymous {

	//�ʵ�
	Remote remote = new Remote() {
		@Override
		public void turnOn() {}
		@Override
		public void turnOff() {}
	};
	
	//�ż���
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
		//����
		Anonymous anony = new Anonymous();
		anony.remote.turnOn();
		
		Remote remote = new Remote() {
			@Override
			public void turnOn() {}
			@Override
			public void turnOff() {}
		};
		
		//�ż��� �Ű�����
		anony.method2(new Remote() {
			@Override
			public void turnOn() {}
			@Override
			public void turnOff() {}
		});
	}

}
