/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Farrel
 */
import java.util.Scanner;
import java.io.*;
public class praktikum1 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String pilihan;
        String temp = null;
        System.out.println("Kalkulator Sederhana");
        System.out.println("1. Perkalian");
        System.out.println("2. Pembagian");
        System.out.println("3. Penjumlahan");
        System.out.println("4. Pengurangan");
        System.out.println("5. Persen");
        System.out.print("Tentukan jenis operasi (tanpa spasi) : ");
        //pilihan = br.readLine();
        
        try{
            pilihan = br.readLine();
          int pil = Integer.parseInt(pilihan);
      
        switch(pil){
            case 1:
            System.out.print("Masukkan angka : ");
            int angka1 = br.read();
                System.out.print("Masukkan angka lagi : ");
                int angka2 = br.read();
                
                int hasil = angka1 * angka2;
                System.out.print(angka1+" x "+angka2+" = "+hasil);
                break;
            case 2:
            System.out.print("Masukkan angka : ");
            int angka3 = br.read();
                System.out.print("Masukkan angka lagi : ");
                int angka4 = br.read();
                
                int hasil2 = angka3 / angka4;
                System.out.print(angka3+" : "+angka4+" = "+hasil2);
                break;
            case 3:
            System.out.print("Masukkan angka : ");
            int angka5 = br.read();
                System.out.print("Masukkan angka lagi : ");
                int angka6 = br.read();
                
                int hasil3 = angka5 + angka6;
                System.out.print(angka5+" + "+angka6+" = "+hasil3);
                break;
            case 4:
            System.out.print("Masukkan angka : ");
            int angka7 = br.read();
                System.out.print("Masukkan angka lagi : ");
                int angka8 = br.read();
                
                int hasil4 = angka7 - angka8;
                System.out.print(angka7+" - "+angka8+" = "+hasil4);
                break;
            case 5:
            System.out.print("Masukkan angka : ");
            int angka9 = br.read();
                System.out.print("Masukkan angka lagi : ");
                int angka0 = br.read();
                
                int hasil5 = angka9 % angka0;
                System.out.print(angka9+" % "+angka0+" = "+hasil5);
                break;                
        }  }
        catch(NumberFormatException nfe){
            System.out.println("Maaf perintah tidak ada dalam sistem.");
        }
        
    }
}
