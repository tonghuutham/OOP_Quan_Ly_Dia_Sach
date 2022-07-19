/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import models.KhachHang;


/**
 *
 * @author Ling
 */
public class KhachHangMapper implements IMapper<KhachHang>{
    @Override
    public KhachHang mapping(ResultSet rs) throws SQLException{
        KhachHang khachHang = new KhachHang(rs.getString("ten"),rs.getString("SDT"), rs.getInt("xep_hang"), rs.getInt("diem"));
        khachHang.setID(rs.getInt("ID"));
        return khachHang;
       //String ID, String ten, String SDT, String xepHang, int diem
    }
}
