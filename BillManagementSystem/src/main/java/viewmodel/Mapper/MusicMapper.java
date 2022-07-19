package viewmodel.Mapper;

import models.MovieProduct;
import models.MusicProduct;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MusicMapper implements IMapper<MusicProduct>{
    @Override
    public MusicProduct mapping(ResultSet resultSet) throws SQLException {
        MusicProduct musicProduct = new MusicProduct();
        musicProduct.setID(resultSet.getInt("ID"));
        musicProduct.setName(resultSet.getString("ten"));

        musicProduct.setAmount(resultSet.getInt("so_luong"));

        musicProduct.setOutPrice(resultSet.getInt("gia_ban"));

        musicProduct.setType(resultSet.getString("loai"));
        musicProduct.setCategory(resultSet.getString("the_loai"));
        musicProduct.setSinger(resultSet.getString("ca_si"));
        musicProduct.setProducer(resultSet.getString("nha_san_xuat"));
        musicProduct.setBand(resultSet.getString("ban_nhac"));
        return musicProduct;
    }
}
