package anonymous;

public interface Action {
	void work();
}

abstract class ActionAbs {
	public abstract void work();
}

class ActionClass {
	public void work() {}
}