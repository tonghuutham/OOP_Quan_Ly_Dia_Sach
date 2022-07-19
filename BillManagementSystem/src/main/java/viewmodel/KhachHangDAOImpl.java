/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import DB.ConnectionDB;
import java.sql.*;
import java.util.List;
import javax.management.Query;
import models.KhachHang;
import viewmodel.Mapper.KhachHangMapper;
import viewmodel.DAO.ServiceDAO;
import viewmodel.DAO.IServiceDAO;
import viewmodel.Mapper.IMapper;
/**
 *
 * @author Ling
 */
public class KhachHangDAOImpl extends ServiceDAO implements KhachHangDAO {
    
    @Override
    public List<KhachHang> showAll(){
        IMapper<KhachHang> mapper = new KhachHangMapper();         
        String sql = "select * from khach_hang";
        
        List<KhachHang> list = query(sql, mapper);
     
        return list;
    }
    @Override
    public void add(KhachHang khachHang){
        String sql = "insert into khach_hang(ten, sdt, xep_hang, diem) values (?,?,?,?)";
        insert(sql, khachHang.getTen(), khachHang.getSDT(), khachHang.getXepHang(), khachHang.getDiem());
    }
    @Override
    public void update(KhachHang khachHang){
        String sql = "update khach_hang set ten = '"+khachHang.getTen()+"', sdt = '"+khachHang.getSDT()+"' where ID = ?";
        update(sql, khachHang.getID());
    }
    @Override
    public void delete(KhachHang khachHang){
        String sql = "delete from khach_hang where ID = ?";
        delete(sql, khachHang.getID());
    }
    @Override
    public KhachHang getByID(int ID){
        IMapper<KhachHang> mapper = new KhachHangMapper();         
        String sql = "select * from khach_hang where id = ?";
        
        List<KhachHang> list = query(sql, mapper, ID);
     
        return list.isEmpty() ? null : list.get(0);
    
    }
}
