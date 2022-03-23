/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;
import data.*;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Application {

    public static void main(String[] args) {
   
        String Nama, Prosesor, Os, Storage;
        int Stok, Core, Ram;
        
        Scanner input = new Scanner(System.in);
        
        var pavilion15 = new Dell();
        var inspire3 = new Axioo();
        
        /* Untuk test Dell Pavilion 15 */
        pavilion15.hpSlogan();
        System.out.print("Nama : "); 
        Nama = input.nextLine();
        System.out.print("Prosesor : "); 
        Prosesor = input.nextLine();
        System.out.print("Jumlah Core : "); 
        Core = input.nextInt();input.nextLine();
        System.out.print("Operating System : "); 
        Os = input.nextLine();
        System.out.print("Ukuran RAM(GB): "); 
        Ram = input.nextInt();input.nextLine();
        System.out.print("Jenis Storage : "); 
        Storage = input.nextLine();
        System.out.print("Stok : "); 
        Stok = input.nextInt();input.nextLine();
        System.out.println("");
        pavilion15.setNama(Nama);
        pavilion15.setProsesor(Prosesor);
        pavilion15.setCore(Core);
        pavilion15.setSO(Os);
        pavilion15.setRam(Ram);
        pavilion15.setStorage(Storage);
        pavilion15.setStok(Stok);
        pavilion15.getAllLaptopData();
        System.out.println("Store Position " + pavilion15.getNama() + 
                " adalah " + pavilion15.getStorePositionLaptop());
        System.out.println("==========================================");
                
        
        /* Untuk test Axioo inspiron */
        inspire3.acerSlogan();
        System.out.print("Nama : "); 
        Nama = input.nextLine();
        System.out.print("Prosesor : "); 
        Prosesor = input.nextLine();
        System.out.print("Jumlah Core : "); 
        Core = input.nextInt();input.nextLine();
        System.out.print("Operating System : "); 
        Os = input.nextLine();
        System.out.print("Ukuran RAM(GB): "); 
        Ram = input.nextInt();input.nextLine();
        System.out.print("Jenis Storage : "); 
        Storage = input.nextLine();
        System.out.print("Stok : "); 
        Stok = input.nextInt();input.nextLine();
        System.out.println("");
        inspire3.setNama(Nama);
        inspire3.setProsesor(Prosesor);
        inspire3.setCore(Core);
        inspire3.setSO(Os);
        inspire3.setRam(Ram);
        inspire3.setStorage(Storage);
        inspire3.setStok(Stok);
        inspire3.getAllLaptopData();
        System.out.println("Store Position " + inspire3.getNama() + 
                " adalah " + inspire3.getStorePositionLaptop());
        System.out.println("==========================================");    
        
    }
    
}
