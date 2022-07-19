package viewmodel.Mapper;

import models.MovieProduct;

import java.sql.ResultSet;
import java.sql.SQLException;
import models.MovieProduct;

public class MovieMapper implements IMapper<MovieProduct>{
    @Override
    public MovieProduct mapping(ResultSet resultSet) throws SQLException {
        MovieProduct movieProduct = new MovieProduct();
        movieProduct.setID(resultSet.getInt("ID"));
        movieProduct.setName(resultSet.getString("ten"));

        movieProduct.setAmount(resultSet.getInt("so_luong"));

        movieProduct.setOutPrice(resultSet.getInt("gia_ban"));

        movieProduct.setType(resultSet.getString("loai"));
        movieProduct.setCategory(resultSet.getString("the_loai"));
        movieProduct.setAuthor(resultSet.getString("tac_gia"));
        movieProduct.setDirector(resultSet.getString("nha_san_xuat"));
      
        return movieProduct;
    }
}
