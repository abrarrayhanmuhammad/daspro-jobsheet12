package Pertemuan14.Tugas;
import java.util.Scanner;

public class Kubus01 {

    public static int hitungVolume(int sisi){
        int volume = sisi * sisi * sisi;

        return volume;
    }

    public static int hiutungLuarPermukaan(int sisi){
        int luarPermukaan = 6 * sisi * sisi;

        return luarPermukaan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Menghitung Volume dan Luar Permukaan Kubus ====");
        System.out.print("Masukan sisi: ");
        int sisi = sc.nextInt();
        int volume = hitungVolume(sisi);
        int luarPermukaan = hiutungLuarPermukaan(sisi);

        System.out.println("Volume kubus adalah " + volume);
        System.out.println("Luar permukaan kubus adalah " + luarPermukaan);
    }
}
