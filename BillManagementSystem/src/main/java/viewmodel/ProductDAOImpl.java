package viewmodel;

import DB.ConnectionDB;
import java.sql.*;
import viewmodel.Mapper.*;
import java.util.Arrays;
import models.BookProduct;
import models.MovieProduct;
import models.MusicProduct;
import models.Product;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import viewmodel.DAO.IServiceDAO;
import viewmodel.DAO.ServiceDAO;

public class ProductDAOImpl extends ServiceDAO implements ProductDAO{
    @Override
    public void add(Product product){
//        int id = 0;
//        
//        String sql = "select ID from san_pham where (ID+1) not in(select ID from san_pham) LIMIT 1";
//        id = selectID(sql)+1;
        
        String sql = "insert into san_pham(ID, gia_ban, loai, ten, so_luong, the_loai) values (?,?,?,?,?,?)"; 
        insert(sql, product.getID(), product.getOutPrice(), product.getType(), product.getName(), product.getAmount(), product.getCategory());
        
        
        if(product instanceof BookProduct bookProduct){
            sql = "INSERT INTO sach(ID_san_pham, tac_gia, dich_gia, nha_xuat_ban) values(?,?,?,?)";
            insert(sql, product.getID(), bookProduct.getAuthor(), bookProduct.getTranslator(), bookProduct.getPublisher());
        }
        if(product instanceof MovieProduct movieProduct){
            sql = "INSERT INTO dia_phim(ID_san_pham, dao_dien, nha_san_xuat) values(?,?,?)";
            insert(sql, product.getID(), movieProduct.getAuthor(), movieProduct.getDirector());
        }

        if(product instanceof MusicProduct musicProduct){
            sql = "INSERT INTO dia_nhac(ID_san_pham, ca_si, nha_san_xuat, ban_nhac) values(?,?,?,?)";
            insert(sql, product.getID(), musicProduct.getSinger(), musicProduct.getProducer(), musicProduct.getBand());
        }
    }

    @Override
    public Product getByID(int id){
        IMapper<Product> mapper = new ProductMapper();
        String sql = "select loai from san_pham where id = "+id;
        String type = selectLoai(sql);
        if (type == null)return null;
        switch (type) {
            case "sách" -> type = "sach";
            case "đĩa phim" -> type = "dia_phim";
            case "đĩa nhạc" -> type = "dia_nhac";
        }
        
        sql =   "select * from san_pham, nhap_hang, "+type+" where nhap_hang.ID_san_pham = san_pham.id and san_pham.id = ? and "+type+".id = san_pham.id and date >= all (select date from nhap_hang where nhap_hang.ID_san_pham = san_pham.id);";
        
        List<Product> list = query(sql, mapper, id);
        
        return list.isEmpty() ? null : list.get(0);
    }
    
    
    @Override
    public List<Product> showAll(){
        IMapper<Product> mapper = new ProductMapper();
        String sql = """
                     select san_pham.id, ten, don_gia, gia_ban, loai, san_pham.so_luong, the_loai, tac_gia, nha_xuat_ban, dich_gia, NULL as dao_dien, NULL as nha_san_xuat, NULL as ca_si, NULL as ban_nhac from san_pham, sach, nhap_hang where san_pham.ID = sach.ID and nhap_hang.ID_san_pham = sach.id and date >= all(select date from nhap_hang where nhap_hang.ID_san_pham = san_pham.id)
                     UNION
                     select san_pham.id, ten, don_gia, gia_ban, loai, san_pham.so_luong, the_loai, NULL as tac_gia, NULL as nha_xuat_ban, NULL as dich_gia, dao_dien, nha_san_xuat, NULL as ca_si, NULL as ban_nhac from san_pham, dia_phim, nhap_hang where san_pham.ID = dia_phim.ID and nhap_hang.ID_san_pham = dia_phim.id and date >= all(select date from nhap_hang where nhap_hang.ID_san_pham = san_pham.id)
                     UNION
                     select san_pham.id, ten, don_gia, gia_ban, loai, san_pham.so_luong, the_loai, NULL as tac_gia, NULL as nha_xuat_ban, NULL as dich_gia, NULL as dao_dien, nha_san_xuat, ca_si, ban_nhac from san_pham, dia_nhac, nhap_hang where san_pham.ID = dia_nhac.ID and nhap_hang.ID_san_pham = dia_nhac.id and date >= all(select date from nhap_hang where nhap_hang.ID_san_pham = san_pham.id)""";
        List<Product> list = query(sql, mapper);
        return list;
    }
    @Override
    public void update(Product sanPham){
        IMapper<Product> mapper = new ProductMapper();
        
        String sql = "update san_pham set ten = '"+sanPham.getName()+"', gia_ban = "+sanPham.getOutPrice()+", so_luong = "+sanPham.getAmount()+", the_loai = '"+sanPham.getCategory()+"' where ID = ?";
        String type = null;
        switch (sanPham.getType()) {
            case "sách" -> type = "sach";
            case "đĩa phim" -> type = "dia_phim";
            case "đĩa nhạc" -> type = "dia_nhac";
        }
        update(sql, sanPham.getID());
        switch (type) {
            case "sach" -> sql = "update sach set tac_gia = '"+((BookProduct) sanPham).getAuthor()+"', dich_gia = '"+((BookProduct) sanPham).getTranslator()+"', nha_xuat_ban = '"+((BookProduct) sanPham).getPublisher()+"' where ID = ?";
            case "dia_phim" -> sql = "update dia_phim set dao_dien = '"+((MovieProduct) sanPham).getAuthor()+"', nha_xuat_ban = '"+((MovieProduct) sanPham).getDirector()+"' where id = ?";
            case "dia_nhac" -> sql = "update dia_nhac set ca_si = '"+((MusicProduct) sanPham).getSinger()+"', nha_san_xuat = '"+((MusicProduct)sanPham).getProducer()+"', ban_nhac = '"+((MusicProduct) sanPham).getBand()+"' where ID = ?";     
        }
        update(sql, sanPham.getID());
    }
    @Override
    public void delete(Product sanPham){
        String sql = "delete from san_pham where ID = ?";
        delete(sql, sanPham.getID());
    }
    public int selectID(String sql){
        IMapper<Integer> mapper = new IntegerMapper();
        IServiceDAO<Integer> is = new ServiceDAO<Integer>() {};
        List<Integer> list = is.query(sql, mapper);
        return list.get(0);
    }
    public String selectLoai(String sql){
        IMapper<String> mapper = new StringMapper();
        IServiceDAO<String> is = new ServiceDAO<String>() {};
        List<String> list = is.query(sql, mapper);
        return list.isEmpty() ? null : list.get(0);
    }

}
