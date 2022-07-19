/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import models.Bill;
import models.KhachHang;
import models.NhanVien;
import models.Product;
import viewmodel.KhachHangDAO;
import viewmodel.KhachHangDAOImpl;
import viewmodel.NhanVienDAO;
import viewmodel.NhanVienDAOImpl;
import viewmodel.ProductDAO;
import viewmodel.ProductDAOImpl;

/**
 *
 * @author Ling
 */
public class BillMapper implements IMapper<Bill>{
    @Override
    public Bill mapping(ResultSet rs) throws SQLException{
        NhanVienDAO nv = new NhanVienDAOImpl();
        NhanVien nhanVien = nv.getByID(rs.getInt("ID_nhan_vien"));
        
        ProductDAO pd = new ProductDAOImpl();
        Product sanPham = pd.getByID(rs.getInt("ID_san_pham"));
        
        
        KhachHangDAO kh = new KhachHangDAOImpl();
        System.out.println("id = "+rs.getInt("ID"));
        System.out.println("id kh = "+rs.getInt("ID_khach_hang"));
        KhachHang khachHang = kh.getByID(rs.getInt("ID_khach_hang"));
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(rs.getString("date"), formatter);
        
        Bill bill = new Bill(nhanVien, sanPham, khachHang, rs.getInt("so_luong"), rs.getInt("don_gia"),dateTime);
        bill.setID(rs.getInt("ID"));
        //String ID, NhanVien nhanVien, Product sanPham, KhachHang khachHang, int soLuong, localdatetime date
        return bill;
    }
}
