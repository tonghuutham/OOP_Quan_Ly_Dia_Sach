/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Ling
 */
public class KhachHang {
      private int ID;
      private String ten;
      private String SDT;
      private int xepHang;
      private int diem;
      
      public KhachHang(){
          this.ID = 0;
          this.ten = "";
          this.SDT = "";
          this.xepHang = 0;
          this.diem = 0;
      }
      public KhachHang(String ten, String SDT, int xepHang, int diem){
          this.ten = ten;
          this.SDT = SDT;
          this.xepHang = xepHang;
          this.diem = diem;
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
      public void setXepHang(int xepHang){
          this.xepHang = xepHang;
      }
      public int getXepHang(){
          return xepHang;
      }
      public void setDiem(int diem){
          this.diem = diem;
      }
      public int getDiem(){
          return diem;
      }
}
