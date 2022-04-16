package service;

import dao.BookDAO;
import vo.BookVO;
import java.util.List;

public class BookService {

    BookDAO bookDAO = new BookDAO();

    public void insertBook(BookVO bookVO) {
        bookDAO.insertBook(bookVO);
    }

    public void deleteBook(BookVO bookVO) {
        bookDAO.deleteBook(bookVO);
    }


    public List<BookVO> bookList() {
        return bookDAO.bookList();
    }
}
