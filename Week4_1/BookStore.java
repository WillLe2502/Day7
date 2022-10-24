package Week4_1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class BookStore {

	public static void main(String[] args) {
		SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");

		Genre genre1 = new Genre(1, "Action");
		Genre genre2 = new Genre(2, "Fiction");
		Genre genre3 = new Genre(3, "Literature");
		Genre genre4 = new Genre(4, "Historic");

		Genre[] genreList = { genre1, genre2, genre3, genre4 };

		Book book1 = new Book(1, 978000, "All The Light We Cannot See", "Anthony Doerr");
		int[] book1Genre = { 2, 3 };
		book1.setGenreId(book1Genre);

		Book book2 = new Book(2, 978140, "The Song Of Achilles", "Madeline Miller");
		int[] book2Genre = { 2, 3, 4 };
		book2.setGenreId(book2Genre);

		Book book3 = new Book(3, 978140, "Harry Potter", "J. K. Rowling");
		int[] book3Genre = { 1 };
		book3.setGenreId(book3Genre);

		Book book4 = new Book(4, 978140, "The Book Thief", "Markus Zusak");
		int[] book4Genre = { 2, 3 };
		book4.setGenreId(book4Genre);
		
		Book[] bookList = {book1, book2, book3, book4};

		Customer customer1 = new Customer(1, "A");
		Customer customer2 = new Customer(2, "B");

		Customer[] customerList = { customer1, customer2 };

		Warehouse warehouse1 = new Warehouse(1, "Sydney", "Darling Harbour st");
		Warehouse warehouse2 = new Warehouse(2, "Melbourne", "Baribinong st");

		Warehouse[] wareHouselist = { warehouse1, warehouse2 };

		Stock stockBook1Syd = new Stock(1, 1, 20);
		Stock stockBook2Syd = new Stock(2, 1, 30);
		Stock stockBook3Mel = new Stock(3, 2, 10);
		Stock stockBook4Mel = new Stock(4, 2, 15);

		Stock[] stockList = { stockBook1Syd, stockBook2Syd, stockBook3Mel, stockBook4Mel };

		Borrow borrow1 = new Borrow(1, 1);
		Borrow borrow2 = new Borrow(2, 2);
		Borrow[] borrowList = { borrow1, borrow2};
		
		int[] bookOrder1 = { 1, 2 };
		int[] bookOrder2 = { 1, 3 };

		BorrowDetail borrowDetail1 = new BorrowDetail(1, bookOrder1, 1, LocalDate.of(2022, 9, 30), bookOrder1.length);
		borrowDetail1.setReturnDate(LocalDate.of(2022, 11, 30));
		BorrowDetail borrowDetail2 = new BorrowDetail(1, bookOrder2, 2, LocalDate.of(2022, 8, 2), bookOrder1.length);
		borrowDetail2.setReturnDate(LocalDate.of(2022, 8, 30));

		BorrowDetail[] borrowDetailList = { borrowDetail1, borrowDetail2 };

		for (int i = 0; i < borrowDetailList.length; i++) {
			borrowDetailList[i].showDetail(genreList, customerList, wareHouselist, stockList, borrowList, bookList);
			System.out.println();
		}

	}

}
