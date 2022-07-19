/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import java.util.List;
import models.KhachHang;

/**
 *
 * @author Ling
 */
public interface KhachHangDAO {
    public List<KhachHang> showAll();
    public void add(KhachHang khachHang);
    public void update(KhachHang khachHang);
    public void delete(KhachHang khachHang);
    public KhachHang getByID(int ID);
}
