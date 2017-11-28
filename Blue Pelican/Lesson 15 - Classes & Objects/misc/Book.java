// Joshua Ciffer //

package misc;

public class Book {

	public String title ;
	public int totalPages, bookmarkedPage, numChapters, currentPage ;
	
	public Book() {
		title = null ;
		totalPages = 0 ;
		bookmarkedPage = 0 ;
		numChapters = 0 ;
		currentPage = 0 ;
	}
	
	public Book(String title) {
		this.title = title ;
		totalPages = 0 ;
		bookmarkedPage = 0 ;
		numChapters = 0 ;
		currentPage = 0 ;
	}
	
	public Book(String title, int totalPages, int bookmarkedPage, int numChapters, int currentPage) {
		this.title = title ;
		this.totalPages = totalPages ;
		this.bookmarkedPage = bookmarkedPage ;
		this.numChapters = numChapters ;
		this.currentPage = currentPage ;
	}
	
	public String openBook() {
		if (bookmarkedPage == 0) {
			currentPage = 1 ;
		} else {
			currentPage = bookmarkedPage ;
		}
		return "Book is open." ;
	}
	
	public void read(int x) {
		currentPage += x ;
	}
	
	public void insertBookmark(int page) {
		bookmarkedPage = page ;
	}
	
	public String closeBook() {
		bookmarkedPage = currentPage ;
		System.out.println("The page is now bookmarked.") ;
		return "Book is closed." ;
	}
	
	public void avgPagePerChapter() {
		System.out.println((int)(totalPages / numChapters)) ;
	}
	
}