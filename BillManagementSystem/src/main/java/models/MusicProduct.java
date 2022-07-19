package models;

import java.time.LocalDate;
import util.Util;
public class MusicProduct extends Product{
    private String singer;
    private String producer;

    private String band;
    
    public MusicProduct(){
        super();
        this.band = "";
        this.producer = "";
        this.singer = "";
    }
    
    public MusicProduct(String name, int amount, int inPrice, int outPrice, String type,String category, String singer, String producer, String band){
        super(name, amount, inPrice, outPrice, type, category);
        this.band = band;
        this.producer = producer;
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getBand(){return band;}

    public void setBand(String band) { this.band = band; }

    @Override
    public void input(){
        super.input();
        System.out.println("Nhap Ten Ca Si:");
        singer = Util.scanner.nextLine();
        System.out.println("Nhap Ten Nha San Xuat:");
        producer = Util.scanner.nextLine();
        System.out.println("Nhap Ten Ban Nhac: ");
        band = Util.scanner.nextLine();
    }

    @Override
    public void output(){
        super.output();
        System.out.println("Ca Si:" + singer);
        System.out.println("Nha San xuat:" + producer);
        System.out.println("Ban nhac" + band);
    }
}
