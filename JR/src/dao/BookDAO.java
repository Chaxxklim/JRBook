package dao;

import util.DBUtil;
import vo.BookList;
import vo.BookVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BookDAO {
    public void insertBook(BookVO bookVO){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBUtil.getConnection();
            String sql = "INSERT INTO JRBOOK\n" +
                    "(\n" +
                    "BOOK_ID,\n" +
                    "BOOK_NAME,\n" +
                    "PUBLISHED_DATE,\n" +
                    "WRITER\n" +
                    ")\n" +
                    "VALUES\n" +
                    "(\n" +
                    "SEQ_ID.NEXTVAL,\n" +
                    "?,\n" +
                    "?,\n" +
                    "?\n" +
                    ")" ;
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, bookVO.getBookName());
            preparedStatement.setString(2, bookVO.getDate());
            preparedStatement.setString(3, bookVO.getWriter());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(BookVO bookVO) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBUtil.getConnection();
            String sql = "DELETE FROM JRBOOK\n" +
                    "WHERE BOOK_NAME =  ? AND \n" +
                    "\t  WRITER = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, bookVO.getBookName());
            preparedStatement.setString(2, bookVO.getWriter());
            preparedStatement.executeUpdate();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ResultSet bookList() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try{
            connection = DBUtil.getConnection();
            String sql = "SELECT * FROM JRBOOK";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

        } catch (Exception e){
            System.out.println("Error : " + e);
        }
        return resultSet;
    }


}
