package day12;


public class EncapsulationEx2 {
	public static void main(String [] args) {	
		Book book1 = new Book();
		
		book1.setId(1111);
		book1.setBookName("Maths");
		book1.setauthorName("Riyaaz");
		book1.setbookPrice(12000);
		
		System.out.println(book1.getBookName());
		System.out.println(book1.getId());
		System.out.println(book1.getauthorName());
		System.out.println(book1.getbookPrice());
	}
}

class Book{
	private int id;
	private String bookName;
	private String authorName;
	private int bookPrice;
	
	public int getId() {
		return id;
	}
	
	public void setId(int bookId) {
		id = bookId;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String name) {
		bookName = name;
	}
	
	public String getauthorName() {
		return authorName;
	}
	
	public void setauthorName(String name) {
		bookName = name;
	}
	
	public int getbookPrice() {
		return bookPrice;
	}
	
	public void setbookPrice(int price) {
		price = bookPrice;
	}
	
	
	
}


