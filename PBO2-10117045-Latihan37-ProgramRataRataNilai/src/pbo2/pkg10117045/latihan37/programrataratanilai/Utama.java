/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117045.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 * @author 
 * NAMA     : Alif Hermawan
 * KELAS    : PBO2 
 * NIM      : 10117045
 * Deskripsi Program : Program ini bserisi perintah untuk menampilkan nilai 
 * rata-rata mahasiswa sesuai jumlah dan nilai yang dimasukan user 
 *
 */
public class Utama {

    public static void main(String[] args) {
        Mahasiswa mah = new Mahasiswa();
        Scanner scn = new Scanner(System.in);

        int n;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scn.nextInt();

        mah.HitungTotal(mah.nilaiMhs, n);
        mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : " + mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n));
        System.out.println("Developed by : Alif Hermawan");

    }
}
