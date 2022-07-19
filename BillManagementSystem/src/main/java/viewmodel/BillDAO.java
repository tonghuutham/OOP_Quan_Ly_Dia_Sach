/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import java.time.LocalDate;
import java.util.List;
import models.Bill;

/**
 *
 * @author Ling
 */
public interface BillDAO {
    public List<Bill> showAll();
    public void add(Bill bill);
    public void updateBill(Bill bill);
    public List<Bill> show(LocalDate tuNgay, LocalDate denNgay);
    public Bill getByID(int ID);
}
