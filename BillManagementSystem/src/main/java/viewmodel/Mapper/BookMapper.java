package viewmodel.Mapper;

import models.BookProduct;
import models.MusicProduct;

import java.awt.print.Book;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements IMapper<BookProduct>{
    @Override
    public BookProduct mapping(ResultSet resultSet) throws SQLException {
        BookProduct bookProduct = new BookProduct();
        bookProduct.setID(resultSet.getInt("ID"));
        bookProduct.setName(resultSet.getString("ten"));

        bookProduct.setAmount(resultSet.getInt("so_luong"));

        bookProduct.setOutPrice(resultSet.getInt("gia_ban"));

        bookProduct.setType(resultSet.getString("loai"));
        bookProduct.setCategory(resultSet.getString("the_loai"));
        bookProduct.setAuthor(resultSet.getString("tac_gia"));
        bookProduct.setPublisher(resultSet.getString("nha_xuat_ban"));
        bookProduct.setTranslator(resultSet.getString("dich_gia"));
        return bookProduct;
    }
}
