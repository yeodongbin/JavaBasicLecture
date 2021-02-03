package anonymous;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("I am working");
			}
		};
		
		ActionAbs actionAbs = new ActionAbs() {
			@Override
			public void work() {
				System.out.println("Abs : I am working");
			}
		};
		
		ActionClass actionclass = new ActionClass() {
			@Override
			public void work() {
				System.out.println("class : I am working");
			}
		};
		
		action.work();
		actionAbs.work();
		actionclass.work();
		
	}

}
