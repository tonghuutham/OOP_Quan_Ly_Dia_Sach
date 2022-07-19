/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import models.NCC;
import models.NhanVien;
import models.NhapKho;
import models.Product;
import viewmodel.NCCDAO;
import viewmodel.NCCDAOImpl;
import viewmodel.NhanVienDAO;
import viewmodel.NhanVienDAOImpl;
import viewmodel.ProductDAO;
import viewmodel.ProductDAOImpl;

/**
 *
 * @author Ling
 */
public class NhapKhoMapper implements IMapper<NhapKho>{
    @Override
    public NhapKho mapping(ResultSet rs) throws SQLException{
        NhanVienDAO nv = new NhanVienDAOImpl();
        NhanVien nhanVien = nv.getByID(rs.getInt("ID_nhan_vien"));
        
        ProductDAO pd = new ProductDAOImpl();
        Product sanPham = pd.getByID(rs.getInt("ID_san_pham"));
        
        NCCDAO nccDao = new NCCDAOImpl();
        NCC ncc = nccDao.getByID(rs.getInt("ID_NCC"));
       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateTime = LocalDate.parse(rs.getString("date"), formatter);
        
        NhapKho nhapKho = new NhapKho(nhanVien, sanPham, ncc, rs.getInt("so_luong"),rs.getInt("don_gia"), dateTime);
        nhapKho.setId(rs.getInt("ID"));
        //NhanVien nhanVien, Product sanPham, NCC ncc, int soLuong, int giaNhap, LocalDateTime ngayNhap
        return nhapKho;
    }
}
