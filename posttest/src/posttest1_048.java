
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class posttest1_048 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<dataMobil> data_mobil = new ArrayList<dataMobil>();

    public static void clearscreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void confirm() throws IOException {
        System.out.print("Tekan 'Enter' untuk melanjutkan\n");
        br.readLine();
    }

    public static void main(String[] args) throws IOException {
        Scanner terminalInput = new Scanner(System.in);
        String pilihan;
        boolean lanjutkan = true;

        while (lanjutkan) {
            clearscreen();
            System.out.println("\t=== PENDATAAN MOBIL ===\n");
            System.out.println("1.\tLihat Seluruh Data Mobil");
            System.out.println("2.\tTambah Data Mobil");
            System.out.println("3.\tUbah Data Mobil");
            System.out.println("4.\tHapus Data Mobil");
            System.out.println("5.\tKeluar Dari Program");

            System.out.println("\nPilih Nomor yang Anda inginkan : ");
            pilihan = terminalInput.next();
            clearscreen();

            switch (pilihan) {
                case "1" :
                    System.out.println("\t=== LIST SELURUH MOBIL ===\n");

                    for(int index = 0; index < data_mobil.size(); index++) {
                        System.out.println("No : " + (index+1) + "\n");
                        System.out.println("Merk Mobil   : " + data_mobil.get(index).merkMobil);
                        System.out.println("Nama Mobil   : " + data_mobil.get(index).namaMobil);
                        System.out.println("Tahun Dibuat : " + data_mobil.get(index).thnDibuat +
                                "\n=====================================");
                    }
                    confirm();
                    clearscreen();
                    break;

                case "2" :
                    System.out.println("\t=== TAMBAH DATA MOBIL ===\n");

                    System.out.println("Masukkan Merk Mobil : ");
                    String merkMobil = br.readLine();
                    System.out.println("Masukkan Nama Mobil : ");
                    String namaMobil = br.readLine();
                    System.out.println("Masukkan Tahun Rilis Mobil : ");
                    int thnDibuat = Integer.parseInt(br.readLine());

                    data_mobil.add(new dataMobil(merkMobil, namaMobil, thnDibuat));
                    System.out.println("\nData Baru Berhasil Ditambahkan\n");
                    confirm();
                    clearscreen();
                    break;

                case "3" :
                    System.out.println("\t=== LIST SELURUH MOBIL ===\n");

                    for(int index = 0; index < data_mobil.size(); index++) {
                        System.out.println("NO : " + (index+1) + "\n");
                        System.out.println("Merk Mobil : " + data_mobil.get(index).merkMobil);
                        System.out.println("Nama Mobil : " + data_mobil.get(index).namaMobil);
                        System.out.println("Tahun Dibuat : " + data_mobil.get(index).thnDibuat +
                                "\n=====================================");
                    }

                    System.out.println("\n\t=== UBAH DATA MOBIL ===\n");
                    System.out.println("Pilih 'No' Mobil yang ingin diubah : ");
                    int index = Integer.parseInt(br.readLine());

                    if(index > 0 && index <= data_mobil.size()) {
                        System.out.println("== MASUKKAN DATA BARU ==\n");
                        System.out.println("Masukkan Merk Mobil : ");
                        String new_merkMobil = br.readLine();
                        System.out.println("Masukkan Nama Mobil : ");
                        String new_namaMobil = br.readLine();
                        System.out.println("Masukkan Tahun Rilis Mobil : ");
                        int new_thnDibuat = Integer.parseInt(br.readLine());

                        data_mobil.set (index -1, (new dataMobil (new_merkMobil, new_namaMobil, new_thnDibuat)));
                        System.out.println("\nData Mobil Berhasil Diubah");
                    } else {
                        System.err.println("Data Mobil Tidak Ditemukan ! + " +
                                "\nSilahkan Pilih NO Mobil yang Tersedia");
                    }
                    confirm();
                    clearscreen();
                    break;

                case "4" :
                    System.out.println("\t=== HAPUS DATA MOBIL ===\n");
                    System.out.println("Pilih 'No' Mobil yang ingin dihapus : ");
                    int no = Integer.parseInt(br.readLine());

                    if(no > 0 && no <= data_mobil.size()) {
                        data_mobil.remove(no - 1);
                        System.out.println("Data Berhasil Dihapus");
                    } else {
                        System.err.println("Data Mobil Tidak Ditemukan ! + " +
                                "\nSilahkan Pilih NO Mobil yang Tersedia");
                    }
                    confirm();
                    clearscreen();
                    break;

                case "5" :
                    System.exit(0);
                default :
                    System.err.println("\nInput anda tidak ditemukan" +
                            "\nSilahkan memasukkan pilihan yang benar!");
            }
            confirm();
            clearscreen();
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