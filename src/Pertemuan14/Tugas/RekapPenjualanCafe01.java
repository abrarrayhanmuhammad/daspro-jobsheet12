package Pertemuan14.Tugas;

import java.util.Scanner;

public class RekapPenjualanCafe01 {

    static void inputData(Scanner sc, String[] menu, int[][] penjualan) {
        System.out.println("\n==== Masukan data penjualan cafe ====\n");

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Input penjualan untuk mennu: " + menu[i]);

            for (int j = 0; j < penjualan[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }

            System.out.println();
        }
    }

    static void tampilData(String[] menu, int[][] penjualan) {

        System.out.println("==============================================================");
        System.out.println("                        TABEL DATA PENJUALAN                 ");
        System.out.println("==============================================================");

        System.out.printf("%-20s", "Menu");
        for (int i = 1; i <= penjualan[0].length; i++) {
            System.out.printf("%-10s", "Hari " + i);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-20s", menu[i]);

            for (int j = 0; j < penjualan[0].length; j++) {
                System.out.printf("%-10d", penjualan[i][j]);
            }

            System.out.println();
        }

        System.out.println("==============================================================");
    }

    static void tampilMenuTertinggi(String[] menu, int[][] penjualan){
        int menuTertinggi = 0;
        int menuTotal = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;

            for (int j = 0; j < penjualan[0].length; j++) {
                total += penjualan[i][j];
            }

            if(total > menuTotal){
                menuTotal = total;
                menuTertinggi = i;
            }

        }

        System.out.println("Menu tertinggi: " + menu[menuTertinggi] + " dengan total " + menuTotal);
    }

    static void tampilRataRata(String[] menu, int[][] penjualan){
        for (int i = 0; i < menu.length; i++) {
            int total = 0;

            for (int j = 0; j < penjualan[0].length; j++) {
                total += penjualan[i][j];
            }

            double rata = total / (double) penjualan[i].length;

            System.out.println(menu[i] + " -> Rata-Rata: " + String.format("%.2f", rata));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu;
        int[][] penjualan;
        
        System.out.println("==== Program Rekap Penjualan Cafe ====\n");

        System.out.println("==== Input jumlah hari penjualan dan jumlah menu ====\n");
        System.out.print("Jumlah hari: ");
        int hari = sc.nextInt();
        System.out.print("Jumlah menu: ");
        int totMenu = sc.nextInt();

        penjualan = new int[totMenu][hari];
        menu = new String[totMenu];

        sc.nextLine();

        System.out.println("\n==== Masukan Data Menu ====\n");
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        inputData(sc, menu, penjualan);
        tampilData(menu, penjualan);

        System.out.println("\n==== Menu Dengan Total Penjualan Tertinggi ====\n");

        tampilMenuTertinggi(menu, penjualan);

        System.out.println("\n==== Data Rata-Rata Penjualan Setiap Menu Selama " + hari + " Hari ====\n");

        tampilRataRata(menu, penjualan);
    }
}
