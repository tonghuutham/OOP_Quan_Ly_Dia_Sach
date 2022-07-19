/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package viewmodel;

import java.util.List;
import models.NCC;

/**
 *
 * @author Ling
 */
public interface NCCDAO {
    public List<NCC> showAll();
    public NCC getByID(int ID);
    public void add(NCC nhanVien);
    public void update(NCC nhanVien);
    public void delete(NCC nhanVien);
}
