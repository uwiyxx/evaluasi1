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
public class ProgramBonusToko {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai pembelian pelanggan : ");
        int harga = input.nextInt();

        if (harga > 5000000) {
            System.out.println("Anda mendapatkan Sound Bar");
        }
        else if (harga > 1500000) {
            System.out.println("Anda mendapatkan TV Bracket");
        }        
         else {
            System.out.println("Tidak Ada Bonus");
            }
        }
    }
