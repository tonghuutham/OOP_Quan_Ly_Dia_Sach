/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import java.util.List;
import models.KhachHang;
import models.NhanVien;
import viewmodel.DAO.ServiceDAO;
import viewmodel.Mapper.IMapper;
import viewmodel.Mapper.KhachHangMapper;
import viewmodel.Mapper.NhanVienMapper;

/**
 *
 * @author Ling
 */
public class NhanVienDAOImpl extends ServiceDAO<NhanVien> implements NhanVienDAO{
    @Override
    public List<NhanVien> showAll(){
        IMapper<NhanVien> mapper = new NhanVienMapper();         
        String sql = "select * from nhan_vien";
        
        List<NhanVien> list = query(sql, mapper);
     
        return list;
    }
    @Override
    public NhanVien getByID(int ID){
        IMapper<NhanVien> mapper = new NhanVienMapper();         
        String sql = "select * from nhan_vien where id = ?";
        
        List<NhanVien> list = query(sql, mapper, ID);
     
        return list.isEmpty() ? null : list.get(0);
    }
    @Override
    public void add(NhanVien nhanVien){
        String sql = "insert into nhan_vien(ten, cccd, sdt, email, tai_khoan, mat_khau) values (?,?,?,?,?,?)";
        insert(sql, nhanVien.getTen(), nhanVien.getCccd(), nhanVien.getSDT(), nhanVien.getEmail(), nhanVien.getTaiKhoan(), nhanVien.getMatKhau());
    }
    @Override
    public void update(NhanVien nhanVien){
        String sql = "update nhan_vien set ten = '"+nhanVien.getTen()+"', cccd = '"+nhanVien.getCccd()+"', sdt = '"+nhanVien.getSDT()+"', email = '"+nhanVien.getEmail()+"', tai_khoan = '"+nhanVien.getTaiKhoan()+"', mat_khau = '"+nhanVien.getMatKhau()+"', hoat_dong = "+nhanVien.getHoatDong()+" where ID = ?";
        update(sql, nhanVien.getID());
    }
    @Override
    public void delete(NhanVien nhanVien){
        String sql = "delete from nhan_vien where ID = ?";
        delete(sql, nhanVien.getID());
    }
}
