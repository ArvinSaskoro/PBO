import java.util.*;
import java.io.*;

public class posttest3_048 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<dataMobil> data_mobil = new ArrayList<dataMobil>();
    static ArrayList<sparePart> spareParts = new ArrayList<sparePart>();
    static ArrayList<spesifikasiMobil> spekMobil = new ArrayList<spesifikasiMobil>();

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
                case "1" :
                    tampilkan();
                    enter();
                    clear();
                    break;

                case "2" :
                    buat();
                    enter();
                    clear();
                    break;

                case "3" :
                    ubah();
                    enter();
                    clear();
                    break;

                case "4" :
                    hapus();
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

            //lanjutkan = getYesorNo("Apakah Anda ingin melanjutkan ?");
        }
    }

    // menampilkan list mobil
    public static void tampilkan() throws IOException {
        System.out.println("\t=== LIST SELURUH MOBIL ===\n");

        for(int index = 0; index < data_mobil.size(); index++) {
            System.out.println("No : " + (index+1) + "\n");
            System.out.println("Merk Mobil      : " + data_mobil.get(index).getMerkMobil());
            System.out.println("Nama Mobil      : " + data_mobil.get(index).getNamaMobil());
            System.out.println("Tahun Dibuat    : " + data_mobil.get(index).getThnDibuat() +
                    "\n=============================================");
        }

        for(int index = 0; index < spekMobil.size(); index++) {
            System.out.println("Posisi Driver   : " + spekMobil.get(index).getPosisiDriver());
            System.out.println("Tipe BBM        : " + spekMobil.get(index).getTipeBBM() +
                    "\n=============================================");
        }

        for(int index = 0; index < spareParts.size(); index++) {
            System.out.println("Sparepart       : " + spareParts.get(index).getPart() +
                    "\n=============================================");
        }
    }

    // menambah data mobil
    public static void buat() throws IOException {
        System.out.println("\t=== TAMBAH DATA MOBIL ===\n");

        System.out.println("Masukkan Merk Mobil        : ");
        String merkMobil = br.readLine();
        System.out.println("Masukkan Nama Mobil        : ");
        String namaMobil = br.readLine();
        System.out.println("Masukkan Tahun Rilis Mobil : ");
        int thnDibuat = Integer.parseInt(br.readLine());
        data_mobil.add(new dataMobil(merkMobil, namaMobil, thnDibuat));
        System.out.println("\tData Mobil Berhasil Ditambahkan\n");

        System.out.println("Masukkan Posisi Driver     : ");
        String posisiDriver = br.readLine();
        System.out.println("Masukkan Tipe BBM          : ");
        String tipeBBM = br.readLine();
        spekMobil.add(new spesifikasiMobil(merkMobil, namaMobil, thnDibuat, posisiDriver, tipeBBM));
        System.out.println("\tSpesifikasi Mobil Berhasil Ditambahkan\n");

        System.out.println("Masukkan Spare Part yang diperlukan : ");
        String part = br.readLine();
        spareParts.add(new sparePart(merkMobil, namaMobil, thnDibuat, part));
        System.out.println("\tSparepart Mobil Berhasil Ditambahkan\n");
    }

    // mengubah data mobil
    public static void ubah() throws IOException {
        tampilkan();

        System.out.println("\n\t === UBAH DATA MOBIL ===\n");
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
            tampilkan();

            System.out.println("Masukkan Posisi Driver     : ");
            String new_posisiDriver = br.readLine();
            System.out.println("Masukkan Tipe BBM          : ");
            String new_tipeBBM = br.readLine();
            spekMobil.set (index -1, (new spesifikasiMobil(new_merkMobil, new_namaMobil, new_thnDibuat, new_posisiDriver, new_tipeBBM)));

            System.out.println("Masukkan Spare Part yang diperlukan : ");
            String new_part = br.readLine();
            spareParts.set (index -1, (new sparePart(new_merkMobil, new_namaMobil, new_thnDibuat, new_part)));

            System.out.println("\nData Mobil Berhasil Diubah");
        } else {
            System.err.println("\n\t\t  Data Mobil Tidak Ditemukan !" +
                    "\n\tSilahkan Pilih Nomor Mobil yang Tersedia");
        }
    }

    // menghapus data mobil
    public static void hapus() throws IOException {
        tampilkan();

        System.out.println("\n\t=== HAPUS DATA MOBIL ===\n");
        System.out.println("Pilih 'No' Mobil yang ingin dihapus : ");
        int idx = Integer.parseInt(br.readLine());

        if(idx > 0 && idx <= data_mobil.size()) {
            data_mobil.remove(idx - 1);
            spareParts.remove(idx - 1);
            spekMobil.remove(idx - 1);
            tampilkan();
            System.out.println("Data Berhasil Dihapus");
        } else {
            System.err.println("\n\t\t  Data Mobil Tidak Ditemukan !" +
                    "\n\tSilahkan Pilih Nomor Mobil yang Tersedia");
        }
    }
    //   private static boolean getYesorNo(String message) {
    //    Scanner terminalInput = new Scanner(System.in);
    //    System.out.println("\n" + message +" (y/n) ?");
    //    String pilihan = terminalInput.next();

    //    while(!pilihan.equalsIgnoreCase("y") && !pilihan.equalsIgnoreCase("n")){
    //        System.err.println("Silahkan Pilih pilihan yang benar ! ");
    //        System.out.println("\n" +message+ " (y/n) ?");
    //        pilihan = terminalInput.next();
    //    }
    //    return pilihan.equalsIgnoreCase("y");}

    //private static void clearScreen(){
    //    try{
    //        if (System.getProperties(key:"os.name").contains("windows")) {
    //            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    //        } else{
    //            System.out.print("\033[H\033[2J");
    //            System.out.flush();
    //        }
    //    }catch (Exception ex){
    //        System.err.println("tidak dapat clear screen");
    //    }
    //}
}
