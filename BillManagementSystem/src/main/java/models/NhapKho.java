/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Ling
 */
public class NhapKho {
    public NhanVien nhanVien;
    public Product sanPham;
    public NCC ncc;
    private int ID;
    private int soLuong;
    private int giaNhap;
    private LocalDate ngayNhap;
    
    public NhapKho(NhanVien nhanVien, Product sanPham, NCC ncc, int soLuong, int giaNhap, LocalDate ngayNhap){
        this.nhanVien = nhanVien;
        this.sanPham = sanPham;
        this.ncc = ncc;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.ngayNhap = ngayNhap;
    }
    
    public void setNhanVien(NhanVien nhanVien){
        this.nhanVien = nhanVien;
    }
    public NhanVien getNhanVien(){
        return nhanVien;
    }
    public void setSanPham(Product sanPham){
        this.sanPham = sanPham;
    }
    public Product getSanPham(){
        return sanPham;
    }
    public void setNCC(NCC ncc){
        this.ncc = ncc;
    }
    public NCC getNCC(){
        return ncc;
    }
    public int getID(){
        return ID;
    }
    public void setId(int ID){
        this.ID=ID;
    }
    public int getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(int soLuong){
        this.soLuong = soLuong;
    }
    public int getGiaNhap(){
        return giaNhap;
    }
    public void setGiaNhap(int giaNhap){
        this.giaNhap=giaNhap;
    }
    public LocalDate getNgayNhap(){
        return ngayNhap;
    }
    public void setNgayNhap(LocalDate ngayNhap){
        this.ngayNhap=ngayNhap;
    }
}
