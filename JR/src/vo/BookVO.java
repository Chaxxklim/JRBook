package vo;

public class BookVO {
    String bookName;
    String writer;
    String date;

    public BookVO(String bookName, String writer, String date) {
        this.bookName = bookName;
        this.writer = writer;
        this.date = date;
    }

    public BookVO(){}

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
