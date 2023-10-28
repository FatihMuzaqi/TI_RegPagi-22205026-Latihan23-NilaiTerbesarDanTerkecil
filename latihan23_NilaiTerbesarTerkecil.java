package tipedata;
import java.util.Scanner;
public class latihan23_NilaiTerbesarTerkecil {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
 
        int maks = 0,min = 100;
        System.out.println("===== PROGRAM NILAI TERBESAR DAN TERKECIL =====");
        System.out.print("Masukan Nama Petugas : ");
        String Nama = input.nextLine();
        System.out.print("Masukan Banyaknya Nilai Mahasiswa : ");
        int jml = input.nextInt();
        for(int i = 1; i <= jml; i++){
            System.out.print(" Masukan Nilai Mahasiswa Ke " + i + " : ");
            int angka = input.nextInt();
            if(angka > maks){
                maks = angka;
            }else if(angka < min ) {
                min = angka;
            }
        }
        System.out.println("========= HASIL NILAI MAHASISWA ==========");
        System.out.println("Nilai Terbesar Adalah  = " + maks);
        System.out.println("Nilai Terkecil Adalah  = " + min);
    } 
}
