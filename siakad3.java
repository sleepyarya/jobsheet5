import java.util.Scanner;

public class siakad3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double nsetara;
        String nhuruf, kualifikasi;

        System.out.println("=================Aplikasi SIAKAD=================");
        System.out.print("Masukkan Nama : ");
        String nama = s.nextLine();

        System.out.print("Masukkan NIM : ");
        String nim = s.nextLine();

        System.out.print("Masukkan Nomor Absen : ");
        byte absen = s.nextByte();

        System.out.print("Masukkan Kelas : ");
        char kelas = s.next().charAt(0);

        

        // nilai
        System.out.println("=================Masukkan Nilai=================");
        System.out.print("Masukkan Nilai Kuis : ");
        double nk = s.nextDouble();

        System.out.print("Masukkan Nilai Tugas : ");
        double nt = s.nextDouble();

        System.out.print("Masukkan Nilai UTS : ");
        double uts = s.nextDouble();

        System.out.print("Masukkan Nilai UAS : ");
        double uas = s.nextDouble();

        // logika

        double na = (nk * 0.20) + (nt * 0.15) + (uts * 0.30) + (uas * 0.35);

        if (na <= 100 && na > 80) {
            nhuruf = "A";
            nsetara = 4;
            kualifikasi = "Sangat Baik";

        } else if (na <= 80 && na > 73) {
            nhuruf = "B+";
            nsetara = 3.5;
            kualifikasi = "Lebih dari baik";

        } else if (na <= 73 && na > 65) {
            nhuruf = "B";
            nsetara = 3;
            kualifikasi = "Baik";

        } else if (na <= 65 && na > 60) {
            nhuruf = "C+";
            nsetara = 2.5;
            kualifikasi = "Lebih dari cukup";

        } else if (na <= 60 && na > 50) {
            nhuruf = "C";
            nsetara = 2;
            kualifikasi = "Cukup";

        } else if (na <= 50 && na > 39) {
            nhuruf = "D";
            nsetara = 1;
            kualifikasi = "Kurang";

        } else {
            nhuruf = "E";
            nsetara = 0;
            kualifikasi = "Gagal";
        }
        // hasil akhir

        System.out.println("=================HASIL AKHIR=================");
        System.out.println("Nama : " +nama+ " || NIM : " +nim);
        System.out.println("Kelas : " +kelas+ " || Absen : " +absen);
        System.out.println("Nilai Akhir : " +na);
        System.out.println("Nilai Huruf : " + nhuruf);
        System.out.println("Nilai Setara : " +nsetara);
        System.out.println("Kualifikasi : "+kualifikasi);
    }


}

