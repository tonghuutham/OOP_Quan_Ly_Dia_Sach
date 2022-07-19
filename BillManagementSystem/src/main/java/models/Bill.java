/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Ling
 */
public class Bill {
    private int ID;
    NhanVien nhanVien = new NhanVien();
    Product sanPham = new Product();
    KhachHang khachHang = new KhachHang();
    private int soLuong;
    private int donGia;
    private LocalDateTime date;
    
    public Bill(NhanVien nhanVien, Product sanPham, KhachHang khachHang, int soLuong, int donGia,LocalDateTime date) {
        this.nhanVien = nhanVien;
        this.sanPham = sanPham;
        this.khachHang = khachHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.date = date;
    }

    public Bill() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public NhanVien getNhanVien(){
        return nhanVien;
    }
    public void setNhanVien(NhanVien nhanVien){
        this.nhanVien = nhanVien;
    }
    public KhachHang getKhachHang(){
        return khachHang;
    }
    public void setKhachHang(KhachHang khachHang){
        this.khachHang = khachHang;
    }
    public Product getSanPham(){
        return sanPham;
    }
    public void setSanPham(Product sanPham){
        this.sanPham = sanPham;
        donGia = sanPham.getOutPrice();
    }
    public int getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(int soLuong){
        this.soLuong = soLuong;
    }
    public int getDonGia(){
        return donGia;
    }

    public LocalDateTime getDate(){
        return date;
    }

    public void output() {
        System.out.println("ID nhan vien "+ nhanVien.getID());
        System.out.println("ID san pham "+ sanPham.getID());
        System.out.println("ID khach Hang "+ khachHang.getID());
        System.out.println("So luong "+ soLuong);
        System.out.println("DOn gia "+ donGia);
        System.out.println("Date time "+ date.toString());
        
        
    }

    
    
}
