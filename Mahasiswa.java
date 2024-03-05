import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mahasiswa {
    public static List<Mahasiswa> listMahasiswa = new ArrayList<>();
    1
    public String Nama;
    public String NIM;
    public String jurusan;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.Nama = nama;
        this.NIM = nim;
        this.jurusan = jurusan;
    }

    public static void main(String[] args) {
        
        boolean runProgram = false;
        while (!runProgram){
        Scanner input = new Scanner(System.in);

        System.out.println("===== Library System =====");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tampilkan Data Mahasiswa");
        System.out.println("3. Keluar");

        System.out.print("Choose Your Option(1-3): ");
        String userRole = input.next();
        input.nextLine();

        switch (userRole) {
            case "1" -> {
                System.out.println("Masu1kkan Nama Mahasiswa: ");
                String nama = input.nextLine();

                System.out.println("Masukkan NIM Mahasiswa : ");
                String nim = input.nextLine();

                if (nim.length() == 15) {
                    System.out.println("Successful Login as Student");
                } else {
                    System.out.println("NIM harus 15 Digit");
                    return; // Kembali ke menu utama setelah pesan kesalahan
                }
                System.out.println("Masukkan Jurusan Mahasiswa: ");
                String jurusan = input.nextLine();

                Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);
                listMahasiswa.add(mahasiswa);
                System.out.println("Data mahasiswa berhasil ditambahkan.");
            }
            case "2" -> tampilDataMahasiswa();
            case "3" -> System.exit(0);
            default -> {
            }
        }
    }
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }

    public static void tampilDataMahasiswa() {
        tampilUniversitas();
        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa m : listMahasiswa) {
            System.out.println("Nama: " + m.Nama + ", NIM: " + m.NIM + ", Jurusan: " + m.jurusan);
        }
    }
}
