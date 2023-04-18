class Library {
	    private String bookId;
	    private String bookName;
	    private String bookAuthor;
	    private int bookCount;
		public String getBookId() {
			return bookId;
		}
		public void setBookId(String bookId) {
			this.bookId = bookId;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getBookAuthor() {
			return bookAuthor;
		}
		public void setBookAuthor(String bookAuthor) {
			this.bookAuthor = bookAuthor;
		}
		public int getBookCount() {
			return bookCount;
		}
		public void setBookCount(int bookCount) {
			this.bookCount = bookCount;
		}	    
}

public class Library_Encp_Assignment {
	public static void main(String[] args) {
		Library l=new Library();
		l.setBookId("06");
		l.setBookName("shivaji maharaj");
		l.setBookAuthor("XYZ");
		l.setBookCount(100);
		System.out.println(l.getBookId()+" "+l.getBookName()+" "+l.getBookAuthor()+" "+l.getBookCount());
		//System.out.println(L.getBookId()+" "+L.getBookName()+" "+L.getBookAuthor()+" "+L.setBookCount(0));
		
	}

}
