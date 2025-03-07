import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen : ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();

        Dosen[] arrayOfDosen = new Dosen[jumlahDosen];
        DataDosen dataDosen = new DataDosen();
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

        System.out.println("\n==== Data Semua Dosen ====");
        dataDosen.dataSemuaDosen(arrayOfDosen);

        System.out.println("\n==== Jumlah Dosen Berdasarkan Jenis Kelamin ====");
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n==== Rata-rata Usia Dosen Berdasarkan Jenis Kelamin ====");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n==== Dosen Paling Tua ====");
        dataDosen.infoDosenPalingTua(arrayOfDosen);

        System.out.println("\n==== Dosen Paling Muda ====");
        dataDosen.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}