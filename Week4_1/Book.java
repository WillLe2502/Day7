package Week4_1;

public class Book {
	private int id;
	private int isbn;
	private String name;
	private String author;
	private int[] genreId;


	public Book(int id, int isbn, String name, String author) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.genreId = genreId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int[] getGenreId() {
		return genreId;
	}

	public void setGenreId(int[] genreId) {
		this.genreId = genreId;
	}

}
