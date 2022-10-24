package Week4_1;

public class Stock {
	private int bookId;
	private int warehouseId;
	private int quantity;

	public Stock(int bookId, int warehouseId, int quantity) {
		super();
		this.bookId = bookId;
		this.warehouseId = warehouseId;
		this.quantity = quantity;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
