/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ASUS
 */
public class Laptop {
 private String Nama, Brand, Prosesor, SO, Storage;
    private int Stok, Core, Ram;
    
    public Laptop(String Nama, String Brand, String Prosesor, int Core, 
            String SO, int Ram, String Storage, int Stok){
        
        this.Nama = Nama;
        this.Brand = Brand; 
        this.Prosesor = Prosesor; 
        this.Core = Core; 
        this.SO = SO; 
        this.Ram = Ram; 
        this.Storage = Storage; 
        this.Stok = Stok; 
    }
    
//    Overloading Constructor 
    public Laptop(){
        this.Nama = "unidentified";
        this.Brand = "unidentified"; 
        this.Prosesor = "unidentified"; 
        this.Core = 0; 
        this.SO = "unidentified"; 
        this.Ram = 0; 
        this.Storage = "unidentified"; 
        this.Stok = 0; 
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getProsesor() {
        return Prosesor;
    }

    public void setProsesor(String Prosesor) {
        this.Prosesor = Prosesor;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    public int getCore() {
        return Core;
    }

    public void setCore(int Core) {
        this.Core = Core;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int Ram) {
        this.Ram = Ram;
    }
    
    public void getAllLaptopData(){
        System.out.println("Nama : "+ Nama);
        System.out.println("Brand : "+ Brand);
        System.out.println("Prosesor : "+ Prosesor);
        System.out.println("Jumlah Core : "+ Core);
        System.out.println("Operating System : "+ SO);
        System.out.println("Ukuran RAM(GB) : "+ Ram);
        System.out.println("Jenis Storage : "+ Storage);
        System.out.println("Stok Tersedia : "+ Stok);
    }
   
}
