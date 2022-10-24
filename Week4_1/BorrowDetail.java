package Week4_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BorrowDetail {
	private int id;
	private int[] bookId;
	private int borrowId;
	private LocalDate borrowDate;
	private LocalDate returnDate;
	private boolean isOverDue;
	private int quantity;

	public BorrowDetail(int id, int[] bookId, int borrowId, LocalDate borrowDate, int quantity) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.borrowId = borrowId;
		this.borrowDate = borrowDate;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int[] getBookId() {
		return bookId;
	}

	public void setBookId(int[] bookId) {
		this.bookId = bookId;
	}

	public int getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(int borrowId) {
		this.borrowId = borrowId;
	}

	public LocalDate getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(LocalDate borrowDate) {
		this.borrowDate = borrowDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public boolean isOverDue() {
		return isOverDue;
	}

	public void setOverDue(boolean isOverDue) {
		this.isOverDue = isOverDue;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void showDetail(Genre[] genreList, Customer[] customerList, Warehouse[] wareHouselist, Stock[] stockList,
			Borrow[] borrowList, Book[] bookList) {
		int borrowId = this.getBorrowId();
		int currentCustomerId = 0;
		String currentCustomerName = null;
		int bookId = 0;
		int[] currentBookList = this.getBookId();

		LocalDate expectedReturnDate = this.getBorrowDate().plusMonths(1);
		LocalDate actualReturnDate = this.getReturnDate();

		int compareDate = expectedReturnDate.compareTo(actualReturnDate);

		System.out.println("Borrow ID: " + borrowId);

		for (int i = 0; i < borrowList.length; i++) {
			if (borrowId == borrowList[i].getId()) {
				currentCustomerId = borrowList[i].getCustomerId();
			}
		}

		for (int i = 0; i < customerList.length; i++) {
			if (currentCustomerId == customerList[i].getId()) {
				currentCustomerName = customerList[i].getName();
			}
		}
		System.out.println("Customer: " + currentCustomerName);

		System.out.println("Borrow Date: " + this.getBorrowDate().format(DateTimeFormatter.ofPattern("dd-MMM-yy")));
		System.out.println("Expected Return Date: "
				+ this.getBorrowDate().plusMonths(1).format(DateTimeFormatter.ofPattern("dd-MMM-yy")));

		if (compareDate >= 0) {
			System.out.println("Return Date: " + this.getReturnDate().format(DateTimeFormatter.ofPattern("dd-MMM-yy")));
			System.out.println("Return On Time");
		} else {
			System.out.println("Haven't Return - Overdue!");
		}

		System.out.println("Current Borrowing: ");

		for (int i = 0; i < currentBookList.length; i++) {
			bookId = currentBookList[i];
			for (int j = 0; j < bookList.length; j++) {
				if (bookId == bookList[j].getId()) {
					System.out.println("  - " + bookList[i].getName());

					System.out.println("      Genre: ");
					int[] currentBookGenre = bookList[i].getGenreId();
					for (int k = 0; k < currentBookGenre.length; k++) {
						for (int l = 0; l < genreList.length; l++) {
							if (currentBookGenre[k] == genreList[l].getId()) {
								System.out.println("       - " + genreList[l].getName());
							}
						}
					}

					System.out.print("      Location: ");
					for (int k = 0; k < stockList.length; k++) {
						if (bookId == stockList[k].getBookId()) {
							int currentWareHouseId = stockList[k].getWarehouseId();
							for (int l = 0; l < wareHouselist.length; l++) {
								if (currentWareHouseId == wareHouselist[l].getId()) {
									System.out.println(wareHouselist[l].getName() + " Warehouse. Address: "
											+ wareHouselist[l].getAddress());
								}
							}
							
							if (compareDate >= 0) {
								System.out.println("      Current Quantity: " + stockList[k].getQuantity());
							} else {
								System.out.println("      Current Quantity: " + (stockList[k].getQuantity() - 1));
							}
						}
					}

				}
			}
		}

	}

}
