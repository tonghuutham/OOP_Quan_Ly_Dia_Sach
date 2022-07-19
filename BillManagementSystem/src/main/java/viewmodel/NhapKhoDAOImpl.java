/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import java.time.LocalDate;
import java.util.List;
import models.NhapKho;
import viewmodel.DAO.ServiceDAO;
import viewmodel.Mapper.IMapper;
import viewmodel.Mapper.NhapKhoMapper;

/**
 *
 * @author Ling
 */
public class NhapKhoDAOImpl extends ServiceDAO implements NhapKhoDAO{
    @Override
    public List<NhapKho> showAll(){
        String sql = "select * from nhap_hang";
        IMapper<NhapKho> mapper = new NhapKhoMapper();
        List<NhapKho> list = query(sql, mapper);
        return list;
    }
    @Override
    public void add(NhapKho nhap){
        String sql = "insert into nhap_hang (ID_san_pham, ID_nhan_vien, ID_NCC, so_luong, don_gia, date) values (?,?,?,?,?,?)";
        insert(sql, nhap.getSanPham().getID(), nhap.getNhanVien().getID(), nhap.getNCC().getID(), nhap.getSoLuong(), nhap.getGiaNhap(), nhap.getNgayNhap());
    }
    @Override
    public void update(NhapKho bill){
    }
    @Override
    public List<NhapKho> show(LocalDate tuNgay, LocalDate denNgay){
        String sql = "select * from nhap_hang where date(date) < "+denNgay+" AND date(date) > "+tuNgay;
        IMapper<NhapKho> mapper = new NhapKhoMapper();
        List<NhapKho> list = query(sql, mapper);
        return list;
    }
    @Override
    public NhapKho getByID(int ID){
        String sql = "select * from nhap_hang where ID = ?";
        IMapper<NhapKho> mapper = new NhapKhoMapper();
        List<NhapKho> list = query(sql, mapper, ID);
        return list.get(0);
    }
}
