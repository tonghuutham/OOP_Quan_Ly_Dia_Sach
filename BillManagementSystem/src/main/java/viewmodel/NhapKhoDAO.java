/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package viewmodel;

import java.time.LocalDate;
import java.util.List;
import models.Bill;
import models.NhapKho;

/**
 *
 * @author Ling
 */
public interface NhapKhoDAO {
    public List<NhapKho> showAll();
    public void add(NhapKho bill);
    public void update(NhapKho bill);
    public List<NhapKho> show(LocalDate tuNgay, LocalDate denNgay);
    public NhapKho getByID(int ID);
}
