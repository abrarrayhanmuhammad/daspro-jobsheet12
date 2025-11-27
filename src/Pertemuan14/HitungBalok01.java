package Pertemuan14;
import java.util.Scanner;

public class HitungBalok01 {

    static int hitungLuas(int pjg, int lb){
        int luas = pjg * lb;
        return luas;
    }

    static int hitungVolume(int tinggi, int a, int b){
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukan panjang: ");
        p = input.nextInt();

        System.out.print("Masukan lebar: ");
        l = input.nextInt();

        System.out.print("Masukan tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);
        
        input.close();
    }
}
