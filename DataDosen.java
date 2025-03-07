public class DataDosen {
    void dataSemuaDosen(Dosen[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1) + ":");
            System.out.println("Kode          : " + arrayOfDosen[i].kode);
            System.out.println("Nama          : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin : " + arrayOfDosen[i].jenisKelamin);
            System.out.println("Usia          : " + arrayOfDosen[i].usia);
            System.out.println("-------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0, countPria = 0, countWanita = 0;
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }
        double rataPria = (countPria > 0) ? (double) totalUsiaPria / countPria : 0;
        double rataWanita = (countWanita > 0) ? (double) totalUsiaWanita / countWanita : 0;
        System.out.println("Rata-rata Usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita);
    }

    void infoDosenPalingTua(Dosen[] arrayOfDosen) {
        int usiaTerbesar = 0, index = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > usiaTerbesar) {
                usiaTerbesar = arrayOfDosen[i].usia;
                index = i;
            }
        }
        System.out.println("Data Dosen Paling Tua:");
        System.out.println("Kode          : " + arrayOfDosen[index].kode);
        System.out.println("Nama          : " + arrayOfDosen[index].nama);
        System.out.println("Jenis Kelamin : " + arrayOfDosen[index].jenisKelamin);
        System.out.println("Usia          : " + arrayOfDosen[index].usia);
    }

    void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
        int usiaTerkecil = arrayOfDosen[0].usia, index = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < usiaTerkecil) {
                usiaTerkecil = arrayOfDosen[i].usia;
                index = i;
            }
        }
        System.out.println("Data Dosen Paling Muda:");
        System.out.println("Kode          : " + arrayOfDosen[index].kode);
        System.out.println("Nama          : " + arrayOfDosen[index].nama);
        System.out.println("Jenis Kelamin : " + arrayOfDosen[index].jenisKelamin);
        System.out.println("Usia          : " + arrayOfDosen[index].usia);
    }
}