import java.util.Scanner;

public class pemilihanbil03{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka: ");
        int angka = s.nextInt();

        if(angka % 2 == 0){
            System.out.println("Angka " + angka + " termasuk bilangan genap");

        }else{
            System.out.println("Angka Ganjil");
        }
    }
}