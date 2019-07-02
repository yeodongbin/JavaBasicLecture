package problem.pro4;

public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}

interface DataAccessObject {
	public abstract void select();
	public abstract void insert();
	public abstract void update();
	public abstract void delete();
}

class OracleDao implements DataAccessObject {
	public void select() {
		System.out.println("Oralce DB���� �˻�");
	}
	public void insert() {
		System.out.println("Oralce DB�� ����");
	}
	public void update() {
		System.out.println("Oralce DB�� ����");
	}
	public void delete() {
		System.out.println("Oralce DB���� ����");
	}
}

class MySqlDao implements DataAccessObject{
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}
	public void insert() {
		System.out.println("MySql DB�� ����");
	}
	public void update() {
		System.out.println("MySql DB�� ����");
	}
	public void delete() {
		System.out.println("MySql DB���� ����");
	}
}
