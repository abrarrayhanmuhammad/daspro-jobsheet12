package Pertemuan14;

import java.util.Scanner;

public class kafe01 {
    public static void Menu(String namaPelanggan, String kodePromo, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda medapatkan diskon 50% dari kode promo yang anda gunakan");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda medapatkan diskon 10% dari kode promo yang anda gunakan");
        }else {
            System.out.println("Kode promo invalid!");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga01(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendaptkan diskon 50%");
            hargaTotal = hargaTotal / 2;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendaptkan diskon 30%");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        } else {
            System.out.println("Kode promo invalid!");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Abrar", "DISKON50", false);

        System.out.print("\nBerapa jenis menu yang ingin Anda pesan: ");
        int jenisMenus = sc.nextInt();

        int totalKeseluruhan = 0;

        for (int i = 0; i < jenisMenus; i++) {
            System.out.print("\nMasukan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukan jumlah item yang ingin Anda pesan: ");
            int banyakItem = sc.nextInt();

            totalKeseluruhan += hitungTotalHarga01(pilihanMenu, banyakItem, "DISKON50");
        }

        System.out.println("Total harga untuk pesanan Anda: Rp " + totalKeseluruhan);

        sc.close();
    }
}
