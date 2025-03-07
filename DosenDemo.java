import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen : ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen[] arrayOfDosen = new Dosen[jumlahDosen];
        String kode, nama;
        int usia;
        boolean jenisKelamin;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();

            System.out.print("Nama          : ");
            nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
            jenisKelamin = sc.nextBoolean();

            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen(kode, nama, jenisKelamin, usia);
            System.out.println("-------------------------------------");
        }

        int index = 1;

        System.out.println("\n===== DATA DOSEN =====");
        for (Dosen dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + index++);
            System.out.println("Kode            : " + dosen.kode);
            System.out.println("Nama            : " + dosen.nama);
            System.out.println("Jenis Kelamin   : " + (dosen.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia            : " + dosen.usia);
            System.out.println("---------------------");
        }
        sc.close();
    }
}