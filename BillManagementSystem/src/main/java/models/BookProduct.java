package models;

import java.time.LocalDate;
import util.Util;

public class BookProduct extends Product{
    private String publisher;
    private String author;
    private String translator;
    public BookProduct(){
        super();
        this.publisher = "";
        this.author = "";
        this.translator = "";
    }
    public BookProduct(String name, int amount,int inPrice, int outPrice , String type, String category , String publisher, String author, String translator){
    super(name, amount, inPrice, outPrice, type, category);
    this.publisher = publisher;
    this.author = author;
    this.translator = translator;
}
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() { return translator; }

    public void setTranslator(String translator) { this.translator = translator; }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap nha xuat ban: ");
        publisher = Util.scanner.nextLine();
        System.out.println("Nhap tac gia: ");
        author = Util.scanner.nextLine();
        System.out.println("Nhap dich gia:");
        translator = Util.scanner.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Nha xuat ban: " + publisher);
        System.out.println("Tac gia: " + author);
        System.out.println("Dich gia: " + translator);
    }
}
