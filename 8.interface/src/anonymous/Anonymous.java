package anonymous;

public class Anonymous {

	// 익명구현객체 Anonymous
	// field
	Remote remote = new Remote() {
		@Override
		public void turnOn() {
		}

		@Override
		public void turnOff() {
		}
	};

	// method1
	void method1() {
		Remote localremote = new Remote() {
			@Override
			public void turnOn() {
			}

			@Override
			public void turnOff() {
			}
		};

	}

	// method2
	void method2(Remote remote) {
		remote.turnOn();
	}

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.remote.turnOn();
		anony.method1();
		anony.method2(new Remote() {
			@Override
			public void turnOn() {
			}

			@Override
			public void turnOff() {
			}
		});

		// local variable
		Remote remote = new Remote() {
			@Override
			public void turnOn() {
			}

			@Override
			public void turnOff() {
			}
		};
	}

}
