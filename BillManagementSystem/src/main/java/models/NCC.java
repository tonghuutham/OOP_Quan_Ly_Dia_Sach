/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Ling
 */
public class NCC {
    private int ID;
    private String ten;
    private String SDT;
    private String email;
    private String diaDiem;
    public NCC(){
        this.ID = 0;
        this.ten = "";
        this.SDT = "";
        this.diaDiem = "";
        this.email = "";
    }
    public NCC(String ten, String email, String SDT, String diaDiem){
        this.ten = ten;
        this.SDT = SDT;
        this.email = email;
        this.diaDiem = diaDiem;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public String getTen(){
        return ten;
    }
    public void setSDT(String SDT){
        this.SDT = SDT;
    }
    public String getSDT(){
        return SDT;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setDiaDiem(String diaDiem){
        this.diaDiem = diaDiem;
    }
    public String getDiaDiem(){
        return diaDiem;
    }
}
