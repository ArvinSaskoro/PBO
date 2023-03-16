
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class posttest2_048 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<dataMobil> data_mobil = new ArrayList<dataMobil>();

    // fungsi enter setiap program memberikan output
    public static void enter() throws IOException {
        System.out.print("\n\t\tTekan 'Enter' untuk melanjutkan\n");
        br.readLine();
    }

    // fungsi clearscreen
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws IOException {
        Scanner terminalInput = new Scanner(System.in);
        String pilihan;
        boolean lanjutkan = true;

        while (lanjutkan) {
            clear();
            // menampilkan tampilan menu
            System.out.println("\t=== PENDATAAN MOBIL ===\n\n" +
                    "1.\tLihat Seluruh Data Mobil\n" +
                    "2.\tTambah Data Mobil\n" +
                    "3.\tUbah Data Mobil\n" +
                    "4.\tHapus Data Mobil\n" +
                    "5.\tKeluar Dari Program");

            System.out.println("\nPilih Nomor yang Anda inginkan : ");
            pilihan = terminalInput.next();

            switch (pilihan) {
                // menampilkan list mobil
                case "1" :
                    System.out.println("\t=== LIST SELURUH MOBIL ===\n");

                    for(int index = 0; index < data_mobil.size(); index++) {
                        System.out.println("No : " + (index+1) + "\n");
                        System.out.println("Merk Mobil   : " + data_mobil.get(index).getmerkMobil());
                        System.out.println("Nama Mobil   : " + data_mobil.get(index).getnamaMobil());
                        System.out.println("Tahun Dibuat : " + data_mobil.get(index).getThnDibuat() +
                                "\n=====================================");
                    }
                    enter();
                    clear();
                    break;

                // menambah data mobil
                case "2" :
                    System.out.println("\t=== TAMBAH DATA MOBIL ===\n");

                    System.out.println("Masukkan Merk Mobil        : ");
                    String merkMobil = br.readLine();
                    System.out.println("Masukkan Nama Mobil        : ");
                    String namaMobil = br.readLine();
                    System.out.println("Masukkan Tahun Rilis Mobil : ");
                    int thnDibuat = Integer.parseInt(br.readLine());

                    data_mobil.add(new dataMobil(merkMobil, namaMobil, thnDibuat));
                    System.out.println("\nData Baru Berhasil Ditambahkan\n");
                    enter();
                    clear();
                    break;

                // mengubah data mobil
                case "3" :
                    System.out.println("\t=== LIST SELURUH MOBIL ===\n");

                    for(int index = 0; index < data_mobil.size(); index++) {
                        System.out.println("NO : " + (index+1) + "\n");
                        System.out.println("Merk Mobil   : " + data_mobil.get(index).getmerkMobil());
                        System.out.println("Nama Mobil   : " + data_mobil.get(index).getnamaMobil());
                        System.out.println("Tahun Dibuat : " + data_mobil.get(index).getThnDibuat() +
                                "\n=====================================");
                    }

                    System.out.println("\n\t=== UBAH DATA MOBIL ===\n");
                    System.out.println("Pilih 'No' Mobil yang ingin diubah : ");
                    int index = Integer.parseInt(br.readLine());

                    if(index > 0 && index <= data_mobil.size()) {
                        System.out.println("== MASUKKAN DATA BARU ==\n");
                        System.out.println("Masukkan Merk Mobil        : ");
                        String new_merkMobil = br.readLine();
                        System.out.println("Masukkan Nama Mobil        : ");
                        String new_namaMobil = br.readLine();
                        System.out.println("Masukkan Tahun Rilis Mobil : ");
                        int new_thnDibuat = Integer.parseInt(br.readLine());

                        data_mobil.set (index -1, (new dataMobil (new_merkMobil, new_namaMobil, new_thnDibuat)));
                        System.out.println("\nData Mobil Berhasil Diubah");
                    } else {
                        System.err.println("\n\t\t  Data Mobil Tidak Ditemukan !" +
                                "\n\tSilahkan Pilih NO Mobil yang Tersedia");
                    }
                    enter();
                    clear();
                    break;

                // menghapus data mobil
                case "4" :
                    System.out.println("\t=== LIST SELURUH MOBIL ===\n");

                    for(int idx = 0; idx < data_mobil.size(); idx++) {
                        System.out.println("NO : " + (idx+1) + "\n");
                        System.out.println("Merk Mobil   : " + data_mobil.get(idx).getmerkMobil());
                        System.out.println("Nama Mobil   : " + data_mobil.get(idx).getnamaMobil());
                        System.out.println("Tahun Dibuat : " + data_mobil.get(idx).getThnDibuat() +
                                "\n=====================================");
                    }

                    System.out.println("\n\t=== HAPUS DATA MOBIL ===\n");
                    System.out.println("Pilih 'No' Mobil yang ingin dihapus : ");
                    int idx = Integer.parseInt(br.readLine());

                    if(idx > 0 && idx <= data_mobil.size()) {
                        data_mobil.remove(idx - 1);
                        System.out.println("Data Berhasil Dihapus");
                    } else {
                        System.err.println("\n\t\t  Data Mobil Tidak Ditemukan !" +
                                "\n\tSilahkan Pilih NO Mobil yang Tersedia");
                    }
                    enter();
                    clear();
                    break;

                // keluar dari program
                case "5" :
                    System.exit(0);
                default :
                    System.err.println("\n\t\t  Input anda tidak ditemukan" +
                            "\n\tSilahkan memasukkan pilihan yang benar!");
                    enter();
                    break;
            }

            clear();
            //lanjutkan = getYesorNo("Apakah Anda ingin melanjutkan ?");
        }
    }

    private static boolean getYesorNo(String message) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("\n" + message +" (y/n) ?");
        String pilihan = terminalInput.next();

        while(!pilihan.equalsIgnoreCase("y") && !pilihan.equalsIgnoreCase("n")){
            System.err.println("Silahkan Pilih pilihan yang benar ! ");
            System.out.println("\n" +message+ " (y/n) ?");
            pilihan = terminalInput.next();
        }
        return pilihan.equalsIgnoreCase("y");
    }
}