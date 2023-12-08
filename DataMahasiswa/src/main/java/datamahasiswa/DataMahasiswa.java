package datamahasiswa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        List<MahasiswaBaru> daftarMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Tambah Pengguna baru (y/n): ");
            String jawaban = input.nextLine();

            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }
            System.out.print("ID Pengguna: ");
            String IDpengguna = input.nextLine();

            System.out.print("Password: ");
            String password = input.nextLine();

            MahasiswaBaru pengguna = new MahasiswaBaru(IDpengguna, password);
            daftarMahasiswa.add(pengguna);
        }

        System.out.println("Daftar Pengguna:");
        daftarMahasiswa.forEach((pengguna) -> {
            System.out.println(pengguna);
        });

        input.close(); // Menutup Scanner
    }
}
