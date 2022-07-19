/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Ling
 */
public class NhanVien {
    private int ID;
    private String ten;
    private String SDT;
    private String cccd;
    private String email;
    private String taiKhoan;
    private String matKhau;
    private int hoatDong;
    public NhanVien(){
        this.ID = 0;
        this.ten = "";
        this.SDT = "";
        this.cccd = "";
        this.email = "";
        this.taiKhoan = "";
        this.matKhau = "";
    }
    public NhanVien(String ten, String cccd, String SDT,  String email, String taiKhoan, String matKhau){
        this.ten = ten;
        this.SDT = SDT;
        this.cccd = cccd;
        this.email = email;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public String getSDT(){
        return SDT;
    }
    public void setSDT(String SDT){
        this.SDT = SDT;
    }
    public String getCccd(){
        return cccd;
    }
    public void setCccd(String cccd){
        this.cccd = cccd;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getTaiKhoan(){
        return taiKhoan;
    }
    public void setTaiKhoan(String taiKhoan){
        this.taiKhoan = taiKhoan;
    }
    public String getMatKhau(){
        return matKhau;
    }
    public void setMatKhau(String matKhau){
        this.matKhau = matKhau;
    }
    public int getHoatDong(){
        return hoatDong;
    }
    public void setHoatDong(int hoatDong){
        this.hoatDong = hoatDong;
    }
    public void output(){
        System.out.println("ten: "+ten);
        System.out.println("sdt: "+SDT);
        System.out.println("email: "+email);
        System.out.println("cccd: "+ cccd);
        System.out.println("tai khoan: "+taiKhoan);
        System.out.println("mat khau: "+matKhau);
    }
}
