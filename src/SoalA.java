import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SoalA {
    public static void main(String[] args) throws IOException {
        // input data mahasiswa
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = Integer.parseInt(input.readLine());
        String[][] mahasiswa = new String[jumlah][5]; // array 2 dimensi untuk menyimpan data mahasiswa

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa " + (i + 1));
            System.out.print("NIM: ");
            mahasiswa[i][0] = input.readLine();
            System.out.print("Nama: ");
            mahasiswa[i][1] = input.readLine();
            System.out.print("Program Studi: ");
            mahasiswa[i][2] = input.readLine();
            System.out.print("Semester Saat Ini: ");
            mahasiswa[i][3] = input.readLine();
            System.out.print("IPS: ");
            mahasiswa[i][4] = input.readLine();
            System.out.println();
        }

        // proses perwalian
        boolean found = false; // status pencarian NIM
        int maxSKS = 0; // variabel untuk menyimpan maksimal SKS
        String[] data = new String[5]; // array untuk menyimpan data mahasiswa yang dicari

        System.out.print("Masukkan NIM mahasiswa yang akan melakukan perwalian: ");
        String cariNIM = input.readLine();

        for (int i = 0; i < jumlah; i++) {
            if (mahasiswa[i][0].equals(cariNIM)) {
                found = true;
                data = mahasiswa[i]; // menyimpan data mahasiswa yang dicari
                double ips = Double.parseDouble(mahasiswa[i][4]); // konversi IPS ke tipe data double

                if (ips >= 3.50) {
                    maxSKS = 24;
                } else if (ips >= 3.00 && ips < 3.50) {
                    maxSKS = 22;
                } else if (ips >= 2.00 && ips < 3.00) {
                    maxSKS = 20;
                } else if (ips < 2.00) {
                    maxSKS = 18;
                }
                break;
            }
        }

        if (found) {
            System.out.println("Data mahasiswa:");
            System.out.println("NIM: " + data[0]);
            System.out.println("Nama: " + data[1]);
            System.out.println("Program Studi: " + data[2]);
            System.out.println("Semester Saat Ini: " + data[3]);
            System.out.println("IPS: " + data[4]);
            System.out.println("Maksimal SKS yang dapat diambil: " + maxSKS);
        } else {
            System.out.println("Data tidak ditemukan");
        }

            // Input data mata kuliah
            int totalSks = 0;
        int ips = 0;
            while (totalSks < maxSKS) {
                System.out.println("Masukkan data mata kuliah: ");
                System.out.print("Nama MK: ");
                String namaMk = input.readLine();
                System.out.print("SKS MK: ");
                int sksMk = Integer.parseInt(input.readLine());
                System.out.print("Hari dan Jam MK: ");
                String hariDanJamMk = input.readLine();

                // Menambah total SKS
                totalSks += sksMk;

                // Output data mata kuliah yang diambil
                System.out.println("Anda mengambil mata kuliah " + namaMk + " (" + sksMk + " SKS) pada hari dan jam " + hariDanJamMk);

                // Cek apakah sudah mencapai SKS maksimal
                if (totalSks >= maxSKS) {
                    break;
                }
                // Jika belum mencapai SKS maksimal, tampilkan sisa SKS yang dapat diambil
                System.out.println("Sisa SKS yang dapat diambil: " + (maxSKS - totalSks));
            }

            // Output data perwalian
            System.out.println("Data Mahasiswa");
            System.out.println("IPS: " + ips);
            System.out.println("Total SKS yang diambil: " + totalSks);
        }


        }

