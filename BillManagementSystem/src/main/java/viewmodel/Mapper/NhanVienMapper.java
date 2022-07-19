/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import models.NhanVien;

/**
 *
 * @author Ling
 */
public class NhanVienMapper implements IMapper<NhanVien>{
    @Override
    public NhanVien mapping(ResultSet rs) throws SQLException{
        NhanVien nhanVien = new NhanVien(rs.getString("ten"), rs.getString("cccd"), rs.getString("SDT"), rs.getString("email"), rs.getString("tai_khoan"), rs.getString("mat_khau"));
        nhanVien.setID(rs.getInt("ID"));
        nhanVien.setHoatDong(rs.getInt("hoat_dong"));
        return nhanVien;
        // String ID, String ten, String SDT, String cccd, String email, String taiKhoan, String matKhau
    }
}
