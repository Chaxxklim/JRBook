package vo;

public class BookVO {
    int bookId;
    String bookName;
    String writer;
    String date;

    public BookVO() {
    }

    public BookVO(int bookId, String bookName, String writer, String date) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.writer = writer;
        this.date = date;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
