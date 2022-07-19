package models;

import java.time.LocalDate;
import util.Util;
public class MovieProduct extends Product {
    private String author;
    private String director;
    
    public MovieProduct(){
        super();
        this.author = "";
        this.director = "";
    }
    public MovieProduct(String name, int amount, int inPrice, int outPrice, String type, String category, String author, String director){
        super(name, amount, inPrice, outPrice, type, category);
        this.author = author;
        this.director = director;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {this.author = author;}

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {this.director = director;}

    @Override
    public void input(){
        super.input();
        System.out.println("Nhap nha san xuat:");
        author = Util.scanner.nextLine();
        System.out.println("Nhap dao dien:");
        director = Util.scanner.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Nha san xuat: " + author);
        System.out.println("Dao dien: " + director);
    }
}
