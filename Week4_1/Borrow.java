package Week4_1;

public class Borrow {
	private int id;
	private int customerId;

	public Borrow(int id, int customerId) {
		super();
		this.id = id;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

}
