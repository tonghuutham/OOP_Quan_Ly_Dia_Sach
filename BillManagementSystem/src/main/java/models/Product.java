package models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import util.Util;

public class Product {
    private int ID;
    private String name;
    private int amount;
    private int outPrice;
    private int inPrice;
    private String type;
    private String category;
    public Product(){
        this.name = "";
        this.amount = 0;
        this.type = "";
        this.outPrice = 0;
        this.category = "";
        this.inPrice = 0;
    }
    public Product(String name, int amount,int inPrice, int outPrice,  String type, String category){
        this.name = name;
        this.amount = amount;
        this.type = type;
        this.outPrice = outPrice;
        this.category = category;
        this.inPrice = inPrice;
    }
    public int getInPrice(){
        return inPrice;
    }
    public void setInPrice(int inPrice){
        this.inPrice = inPrice;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public int getOutPrice() {return outPrice; }

    public void setOutPrice(int outPrice) {
        this.outPrice = outPrice;
    }


    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getCategory(){return category;}
    public void setCategory(String category) {this.category = category;}

    public void input(){
        System.out.println("Nhap ten: ");
        name = (Util.scanner.nextLine());
        System.out.println("Nhap so luong: ");
        amount = Integer.parseInt(Util.scanner.nextLine());
        System.out.println("Nhap gia ban ra: ");
        outPrice = Integer.parseInt(Util.scanner.nextLine());
        System.out.println("Nhap loai san pham:");
        type = (Util.scanner.nextLine());
        System.out.println("Nhap the loai:");
        category = (Util.scanner.nextLine());


    }

    public void output(){
        System.out.println("ID: " + ID);
        System.out.println("Ten: " + name);
        System.out.println("Gia nhap: " + inPrice);
        System.out.println("So luong: " + amount);
        System.out.println("Gia ban ra: " + outPrice);
        System.out.println(("Loai san pham:" + type));
        System.out.println("The loai: " + category);
    }
}
