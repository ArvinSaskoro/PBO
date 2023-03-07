
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihan;
        boolean lanjutkan = true;

        while (lanjutkan) {
            clearScreen();

            System.out.println("\t === Pendataan Mobil ===\n");
            System.out.println("1.\tLihat Seluruh Mobil");
            System.out.println("2.\tTambah Data Mobil");
            System.out.println("3.\tUbah Data Mobil");
            System.out.println("4.\tHapus Data Mobil");
            System.out.println("5.\tKeluar Dari Program");

            System.out.println("\nPilihan anda : ");
            pilihan = terminalInput.next();

            switch (pilihan) {
                case "1":
                    System.out.println("== LIST SELURUH MOBIL ==");
                    // tampilkan data
                    break;
                case "2":
                    System.out.println("== TAMBAH DATA MOBIL ==");
                    // tambah data
                    break;
                case "3":
                    System.out.println("== UBAH DATA MOBIL ==");
                    // ubah data
                    break;
                case "4":
                    System.out.println("== HAPUS DATA MOBIL ==");
                    // hapus data
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan" +
                            "\nSilahkan memasukkan pilihan yang benar!");
            }

            lanjutkan = getYesorNo("Apakah Anda ingin melanjutkan ?");
        }

    }

    private static void tampilkanData() throws IOException {

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
    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143");
            }
        } catch (Exception ex) {
            System.err.println("tidak bisa clear screen");
        }
    }

}