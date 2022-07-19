package viewmodel.Mapper;

import java.security.interfaces.RSAKey;
import models.MusicProduct;
import models.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import models.BookProduct;
import models.MovieProduct;

public class ProductMapper implements IMapper<Product>{
    @Override
    public Product mapping(ResultSet resultSet) throws SQLException {
        Product pd = null;
        String type = resultSet.getString("loai");
        switch (type) {
            case "sách" -> type = "sach";
            case "đĩa phim" -> type = "dia_phim";
            case "đĩa nhạc" -> type = "dia_nhac";
        }
        
        if (null == type){
            return null;
        }else
            pd = switch (type) {
            case "sach" -> new BookProduct( resultSet.getString("ten"),
                                            resultSet.getInt("so_luong"),
                                            resultSet.getInt("don_gia"),
                                            resultSet.getInt("gia_ban"),
                                            resultSet.getString("loai"),
                                            resultSet.getString("the_loai"),
                                            resultSet.getString("nha_xuat_ban"),
                                            resultSet.getString("tac_gia"),
                                            resultSet.getString("dich_gia"));
                //String name, int amount,int outPrice, String type, String category, String publisher, String author, String translator){
            case "dia_phim" -> new MovieProduct(resultSet.getString("ten"),
                                            resultSet.getInt("so_luong"),
                                            resultSet.getInt("don_gia"),
                                            resultSet.getInt("gia_ban"),
                                            resultSet.getString("loai"),
                                            resultSet.getString("the_loai"),
                                            resultSet.getString("tac_gia"),
                                            resultSet.getString("nha_san_xuat"));
                //String name, int amount,int outPrice, String type, String category, String author, String director
            default -> new MusicProduct(    resultSet.getString("ten"),
                                            resultSet.getInt("so_luong"),
                                            resultSet.getInt("don_gia"),
                                            resultSet.getInt("gia_ban"),
                                            resultSet.getString("loai"),
                                            resultSet.getString("the_loai"),
                                            resultSet.getString("ca_si"),
                                            resultSet.getString("nha_san_xuat"),
                                            resultSet.getString("ban_nhac"));
                //(String name, int amount,int outPrice, String type, String category, String singer, String producer, String band)
        };
        pd.setID(resultSet.getInt("ID"));
        return pd;        
    }
}
