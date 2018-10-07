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

public class Mahasiswa {

    public int nilaiMhs;
    public double totalNilaiMhs;
    Scanner scn = new Scanner(System.in);

    public double HitungTotal(int parNilaiMhs, int parN) {
        for (int i = 1; i <= parN; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            parNilaiMhs = scn.nextInt();
            totalNilaiMhs += parNilaiMhs;
        }
        return totalNilaiMhs;
    }

    public double HitungRataRataNilaiMhs(double total, int jmlhMhs) {
        return total / jmlhMhs;
    }
}
