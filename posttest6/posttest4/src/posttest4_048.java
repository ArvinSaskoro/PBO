import java.util.*;
import java.io.*;

final class posttest4_048 {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<dataMobil> data_mobils = new ArrayList<dataMobil>();
    static ArrayList<spesifikasiMobilBesar> spekMobilBesar = new ArrayList<spesifikasiMobilBesar>();
    static ArrayList<spesifikasiMobilKecil> spekMobilKecil = new ArrayList<spesifikasiMobilKecil>();

    // fungsi enter setiap program memberikan output
    final static void enter() throws IOException {
        System.out.print("\n\t\tTekan 'Enter' untuk melanjutkan\n");
        br.readLine();
    }

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" ===== Login =====");
        System.out.print("Masukkan username: ");
        String username = reader.readLine();
        
        System.out.print("Masukkan password: ");
        String password = reader.readLine();
        System.out.println(" =================");
        
        if (ListAkun.authenticate(username, password)) {
            System.out.println("Login berhasil.");
            Menu(args);
        } 
        else{
            System.out.println("Login gagal. Coba lagi.");
            System.out.println("\n");
        }
    }
    public static void Menu(String[] args) throws IOException {
        try (Scanner terminalInput = new Scanner(System.in)) {
            String pilihan;
            boolean lanjutkan = true;

            while (lanjutkan) {
                
                
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
                        break;

                    case "2" :
                        buat();
                        enter();
                        break;

                    case "3" :
                        ubah();
                        enter();
                        break;

                    case "4" :
                        hapus();
                        enter();
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
            }
        }
    }

    // menampilkan list mobil
    public static void tampilkan() throws IOException {
        System.out.println("\t=== LIST SELURUH MOBIL ===\n");
        
        for (int i = 0; i < spekMobilBesar.size(); i++) {
            System.out.println("Pesanan ke-" + (i+1));
            System.out.println("Nama Pembeli: " + spekMobilBesar.get(i).getPosisiDriver());
            System.out.println("Anda Memesan : " + spekMobilBesar.get(i).getTipeBBM());
            System.out.println("\n=============================================");
        }
        for (int i = 0; i < spekMobilKecil.size(); i++) {
            System.out.println("Tipe pesesanan: " + spekMobilKecil.get(i).getPosisiDriver());
            System.out.println("deskripsi pesanan: " + spekMobilKecil.get(i).getPosisiDriver());
        }
    }

    // menambah data mobil
    public static void buat() throws IOException {
        System.out.println("Jenis Mobil Yang Ditambah\n1.\tKecil\n2.\tBesar\n\nPilih Nomor yang Anda inginkan :");
        int jenis_number= Integer.parseInt(br.readLine());
        System.out.println("\t=== TAMBAH DATA MOBIL ===\n");
        System.out.println("Masukkan Merk Mobil        : ");
        String merkMobil = br.readLine();
        System.out.println("Masukkan Nama Mobil        : ");
        String namaMobil = br.readLine();
        System.out.println("Masukkan Tahun Rilis Mobil : ");
        int thnDibuat = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Posisi Driver     : ");
        String posisiDriver = br.readLine();
        System.out.println("Masukkan Tipe BBM          : ");
        String tipeBBM = br.readLine();
        if (jenis_number==1){
            spesifikasiMobilKecil tambah= new spesifikasiMobilKecil(merkMobil, namaMobil, thnDibuat,posisiDriver,tipeBBM);
        spekMobilKecil.add(tambah);}
        else if (jenis_number==2){spesifikasiMobilBesar tambah= new spesifikasiMobilBesar(merkMobil, namaMobil, thnDibuat,posisiDriver,tipeBBM);
            spekMobilBesar.add(tambah);}
    }

    // mengubah data mobil
    public static void ubah() throws IOException {
        tampilkan();
        System.out.println("\n\t === UBAH DATA MOBIL ===\n");
        System.out.println("Pilih Jenis Mobil Yang Diubah\n1.\tKecil\n2.\tBesar\n\nPilih Nomor yang Anda inginkan :");
        int idx_ubah= Integer.parseInt(br.readLine());
        System.out.println("Pilih 'No' Mobil yang ingin diubah : ");
        int index = Integer.parseInt(br.readLine());
        int sizes=1;
            if(idx_ubah==1 ){
                sizes=spekMobilKecil.size();}
            else if(idx_ubah==2 ){
                sizes=spekMobilBesar.size();}
        if(index > 0 && index <= sizes) {
            System.out.println("== MASUKKAN DATA BARU ==\n");
            System.out.println("Masukkan Merk Mobil        : ");
            String new_merkMobil = br.readLine();
            System.out.println("Masukkan Nama Mobil        : ");
            String new_namaMobil = br.readLine();
            System.out.println("Masukkan Tahun Rilis Mobil : ");
            int new_thnDibuat = Integer.parseInt(br.readLine());
            System.out.println("Masukkan Posisi Driver     : ");
            String new_posisiDriver = br.readLine();
            System.out.println("Masukkan Tipe BBM          : ");
            String new_tipeBBM = br.readLine();
        if(idx_ubah==1 ){
            spekMobilKecil.set (index -1, (new spesifikasiMobilKecil(new_merkMobil, new_namaMobil, new_thnDibuat,new_posisiDriver,new_tipeBBM)));}
        else if(idx_ubah==2 ){
            spekMobilBesar.set (index -1, (new spesifikasiMobilBesar(new_merkMobil, new_namaMobil, new_thnDibuat,new_posisiDriver,new_tipeBBM)));}}
        tampilkan();
        }

    // menghapus data mobil
    public static void hapus() throws IOException {
        tampilkan();
        System.out.println("\n\t=== HAPUS DATA MOBIL ===\n");
        System.out.println("Pilih Jenis Mobil Yang Dihapus\n1.\tKecil\n2.\tBesar\n\nPilih Nomor yang Anda inginkan :");
        int idx_hapus = Integer.parseInt(br.readLine());
        System.out.println("Pilih 'No' Mobil yang ingin dihapus : ");
        int idx_no = Integer.parseInt(br.readLine());
        if (idx_hapus==1){
            if(idx_no > 0 && idx_no <= spekMobilKecil.size()) {
                spekMobilKecil.remove(idx_no - 1);
                System.out.println("Data Berhasil Dihapus");
            }
        }
        else if (idx_hapus==2){
            if(idx_no > 0 && idx_no <= spekMobilBesar.size()) {
                spekMobilBesar.remove(idx_no - 1);
                System.out.println("Data Berhasil Dihapus");
            }
        }
    }
}
