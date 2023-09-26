/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class VolumeBangunRuang {
    public static void main(String[] args) {
        double Balok, Kubus, volume , pb, lb , tb;
        int sisi;
            System.out.println("=================================");
            System.out.println("Kalkulator Volume Bangun Ruang");
            System.out.println("=================================");
        Scanner input = new Scanner(System.in);
        int pilihan;
        char ulang;
        do {
        
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        
        System.out.println("Masukkan pilihan anda (1/2 : ");
        sisi = input.nextInt();
        
        switch (sisi) {
            case 1 :
                System.out.println("Masukkan sisi kubus :");
                sisi = input.nextInt();
                
                Kubus = sisi * sisi * sisi;
                
                System.out.println("Volume Kubus :"+Kubus);
                break;
                
            case 2 :
                System.out.print("Masukan panjang Balok :"); pb = input.nextInt();
                System.out.print("Masukan lebar Balok :"); lb = input.nextInt();
                System.out.print("Masukan tinggi Balok :"); tb = input.nextInt();
                
                volume = pb * lb * tb ;
                System.out.println("volume balok : "+ volume );
                
        }
            System.out.println();
            System.out.print("apakah anda ingin melanjutkan (y/t)?:");
            ulang = input.next().charAt(0);
            System.out.println();
    } while (ulang !='t');
        System.out.println("selesai");   
    }
}
