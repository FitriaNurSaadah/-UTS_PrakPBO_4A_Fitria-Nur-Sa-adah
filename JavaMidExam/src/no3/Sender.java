/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no3;

/**
 *
 * @author ASUS
 */
public class Sender {
    public static void main(String[] args) {
         var std = new StdMessenger();
        System.out.println("StdMessenger\n");
        std.sendMessage("", "Coba", "Hai!");
        std.sendMessage("Fitria Nur Sa'adah", "PT Jaya", "Selamat anda DITERIMA sebagai Software Dev di PT Jaya ?");
        
       var mail = new MailMessenger();
        System.out.println("----------------------------------------------------");
        System.out.println("MailMessenger\n");
        mail.connect();
        mail.sendMessage("", "PT AI", "Beritahu saya!");
        mail.sendMessage("fitria@gmail.com", "PT Indo", "Maaf anda BELUM LOLOS seleksi di PT Indo");
        mail.disconnect();
        mail.sendMessage("Amel", "ABC", "SELAMAT UNTUK ANDA");
    }
    
}
