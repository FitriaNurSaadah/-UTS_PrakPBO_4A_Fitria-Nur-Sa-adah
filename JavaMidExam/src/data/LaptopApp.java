/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LaptopApp {
    public static void main(String[] args) {
        var input = new Scanner(System.in);  
      
         String Nama, Brand, Prosesor, Os, Storage;
        int Stok,Core, Ram;
        
          System.out.println("===================Input Deskripsi Laptop ==================");
        
        System.out.print("Nama : "); Nama = input.nextLine();
        System.out.print("Brand : "); Brand = input.nextLine();
        System.out.print("Prosesor : "); Prosesor = input.nextLine();
        System.out.print("Jumlah Core : "); Core = input.nextInt();input.nextLine();
        System.out.print("Operating System : "); Os = input.nextLine();
        System.out.print("Ukuran RAM(GB): "); Ram = input.nextInt();input.nextLine();
        System.out.print("Jenis Storage : "); Storage = input.nextLine();
        System.out.print("Stok : "); Stok = input.nextInt();
        input.close();
        
        System.out.println("=================== Output Deskripsi Laptop ==================");
        
        var spesifikasi = new Laptop(Nama, Brand, Prosesor, Core, Os, Ram, Storage, Stok);
        spesifikasi.getAllLaptopData();
        
    }
    
}
