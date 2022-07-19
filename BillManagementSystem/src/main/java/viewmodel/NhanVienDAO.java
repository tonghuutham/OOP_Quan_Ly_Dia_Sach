/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package viewmodel;

import java.util.List;
import models.NhanVien;

/**
 *
 * @author Ling
 */
public interface NhanVienDAO {
    public List<NhanVien> showAll();
    public NhanVien getByID(int ID);
    public void add(NhanVien nhanVien);
    public void update(NhanVien nhanVien);
    public void delete(NhanVien nhanVien);
}
