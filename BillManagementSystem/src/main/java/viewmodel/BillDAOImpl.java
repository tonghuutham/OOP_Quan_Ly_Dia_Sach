/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import DB.ConnectionDB;
import java.sql.*;
import java.time.LocalDate;
import java.util.List;
import models.Bill;
import viewmodel.DAO.ServiceDAO;
import viewmodel.Mapper.BillMapper;
import viewmodel.Mapper.IMapper;

/**
 *
 * @author Ling
 */
public class BillDAOImpl extends ServiceDAO<Bill> implements BillDAO{   
    
    @Override
    public List<Bill> showAll(){
        String sql = "select * from ban_hang";
        IMapper<Bill> mapper = new BillMapper();
        return query(sql, mapper);
    }
    @Override
    public void add(Bill bill){
        String sql = "insert into ban_hang (ID_san_pham, ID_nhan_vien, ID_khach_hang, so_luong, don_gia, date) values (?,?,?,?,?,?)";
        insert(sql, bill.getSanPham().getID(), bill.getNhanVien().getID(), bill.getKhachHang().getID(), bill.getSoLuong(), bill.getDonGia(),  bill.getDate());
    }
    @Override
    public void updateBill(Bill bill){
        String sql = "update ban_hang set ID_san_pham = ?, so_luong = ? where id = ?";
        update(sql, bill.getSanPham().getID(), bill.getSoLuong(), bill.getID());
    }
    @Override
    public List<Bill> show(LocalDate tuNgay, LocalDate denNgay){
        String sql = "select * from ban_hang where date(date) < "+denNgay+" AND date(date) > "+tuNgay;
        IMapper<Bill> mapper = new BillMapper();
        return query(sql, mapper);
    }
    @Override
    public Bill getByID(int ID){
        String sql = "select * from ban_hang where ID = ?";
        IMapper<Bill> mapper = new BillMapper();
        List<Bill> list = query(sql, mapper, ID);
        return list.isEmpty() ? null : list.get(0);
    }
}
