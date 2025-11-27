package Pertemuan14.Tugas;

import java.util.Scanner;

public class NilaiMahasiswa01 {

    public static void isianArray(int[] array) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

    }

    public static void tampilArray(int[] array) {
        System.out.println("=== Daftar Nilai Mahasiswa ===");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + array[i]);
        }
        
    }

    public static int hitTot(int[] array) {
        int total = 0;

        for (int nilai : array) {
            total += nilai;
        }
        
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);

        int total = hitTot(nilaiMahasiswa);
        System.out.println("Total nilai seluruh mahasiswa: " + total);
    }

}
