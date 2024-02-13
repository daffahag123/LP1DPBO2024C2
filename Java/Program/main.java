/* 
    Saya Daffa Fakhry Anshori dengan NIM 2200337 mengerjakan soal Latihan 1 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

// Import Library
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // Instansiasi konstruktor
        DPR anggota = new DPR();
        ArrayList<DPR> listDPR = new ArrayList<>();

        // Deklarasi atribut
        int i = 0, n = 0, query = 0;
        String cari;                        // untuk masukan ID yang dicari
        String id, nama, bidang, partai;    // untuk masukan data anggota DPR
        int ketemu = 0;                     // untuk pengecek jika data ada yg diubah/dihapus

        do {
            // Tabel menampilkan pilihan query yang ada
            System.out.println("===============================");
            System.out.println("|        DAFTAR QUERY         |");
            System.out.println("===============================");
            System.out.println("1. Tambah Data"); 
            System.out.println("2. Ubah Data"); 
            System.out.println("3. Hapus Data"); 
            System.out.println("4. Tampil Data"); 
            System.out.println("5. Keluar"); 
            System.out.println("===============================");
            System.out.println();

            // Input harus melalui suatu objek
            Scanner sc = new Scanner(System.in);

            // Membaca input query
            System.out.print("Pilih nomor query : ");
            try {
                // Masukan integer
                query = sc.nextInt();
                sc.nextLine();          // Membersihkan karakter newline dari buffer masukan
            } catch (Exception e) {
                // Masukan bukan integer
                System.out.println();
                System.out.println("The input is not an integer!");
                System.out.println();
            }

            // Jika memilih query selain dari pilihan
            if(query > 5 && query == 0) {
                System.out.println("Query tidak ada");
            }

            switch(query) {
                // Pilihan 1 : Tambah Data
                case 1:
                    // Menampilkan tabel untuk masukan data
                    System.out.println();
                    System.out.println("===============================");
                    System.out.println("| Masukkan Data Anggota DPR!  |");
                    System.out.println("===============================");
                    System.out.print("- ID     : ");
                    id = sc.nextLine();
                    System.out.print("- Nama   : ");
                    nama = sc.nextLine();
                    System.out.print("- Bidang : ");
                    bidang = sc.nextLine();
                    System.out.print("- Partai : ");
                    partai = sc.nextLine();
                    System.out.println("===============================");
                    System.out.println();

                    // Mengatur nilai atribut anggota DPR
                    anggota.set_id(id);
                    anggota.set_nama(nama);
                    anggota.set_bidang(bidang);
                    anggota.set_partai(partai);

                    // Menambahkan anggota DPR ke dalam list
                    listDPR.add(anggota);

                    // Menampikan pesan berhasil
                    System.out.println("SUCCESS!"); 
                    System.out.println("Data Berhasil Ditambahkan!");
                    System.out.println();
                break;

                // Pilihan 2 : Ubah Data
                case 2:
                    // Menampilkan teks untuk meminta masukan ID yang ingin diubah datanya
                    System.out.println();
                    System.out.println("Masukkan ID Anggota DPR yang ingin diubah datanya :");
                    // Meminta masukan ID 
                    cari = sc.nextLine();
                    ketemu = 0;

                    // Melakukan iterasi melalui list untuk mencari anggota DPR dengan ID yang sesuai
                    for(i = 0; i < listDPR.size(); i++) {
                        // Memeriksa apakah ID anggota DPR yang ditemukan dalam list sesuai dengan ID yang dicari
                        // Jika iya, Lakukan:
                        if(listDPR.get(i).get_id().equals(cari)) {
                            // Menampilkan pesan ditemukan
                            System.out.println();
                            System.out.println("ID ditemukan! Silahkan mengubah data!");
                            System.out.println();
                            // Menampilkan tabel untuk mengubah data
                            System.out.println("===============================");
                            System.out.println("|    Ubah Data Anggota DPR    |");
                            System.out.println("===============================");
                            System.out.print("- Ubah Nama   : ");
                            nama = sc.nextLine();
                            System.out.print("- Ubah bidang : ");
                            bidang = sc.nextLine();
                            System.out.print("- Ubah Partai : ");
                            partai = sc.nextLine();
                            System.out.println("===============================");
                            System.out.println();

                            // Mengubah nilai atribut anggota DPR yang sesuai
                            listDPR.get(i).set_nama(nama);
                            listDPR.get(i).set_bidang(bidang);
                            listDPR.get(i).set_partai(partai);

                            // Menampilkan pesan berhasil
                            System.out.println("SUCCESS!");
                            System.out.println("Data Berhasil Diperbaharui!");
                            System.out.println();

                            // Data berhasil diupdate
                            ketemu = 1;
                        }  
                    }
                    
                    // Jika tidak ada perubahan data / tidak ditemukan ID yang ingin dicari
                    if(ketemu == 0) {
                        // Menampilkan pesan error
                        System.out.println();
                        System.out.println("Error: Terjadi kesalahan saat mencoba mengubah data. ID tidak ditemukan.");
                        System.out.println();
                    }
                break;

                // Pilihan 3 : Hapus Data
                case 3:
                    // Menampilkan teks untuk meminta masukan ID yang ingin dihapus datanya
                    System.out.println();
                    System.out.println("Masukkan ID yang ingin dihapus : "); 
                    // Meminta masukan ID
                    cari = sc.nextLine();
                    ketemu = 0;

                    // Melakukan iterasi melalui list untuk mencari anggota DPR dengan ID yang sesuai
                    for(i = 0; i < listDPR.size(); i++) {
                        // Memeriksa apakah ID ditemukan
                        // Jika iya, Lakukan: 
                        if(listDPR.get(i).get_id().equals(cari)) {
                            // Melakukan penghapusan data
                            listDPR.remove(i);

                            // Menampilkan pesan berhasil
                            System.out.println();
                            System.out.println("SUCCESS!");
                            System.out.println("Data Berhasil Dihapus!");
                            System.out.println();

                            // Data berhasil dihapus
                            ketemu = 1;
                        }
                    }

                    // Jika tidak ada penghapusan data / tidak ditemukan ID yang ingin dicari
                    if(ketemu == 0) {
                        // Menampilkan pesan error
                        System.out.println();
                        System.out.println("Error: Terjadi kesalahan saat mencoba menghapus data. ID tidak ditemukan.");
                        System.out.println();
                    }
                break;

                case 4:
                    // Jika tidak ada daftar anggota DPR
                    if(listDPR.size() == 0) {
                        System.out.println();
                        System.out.println("===============================");
                        System.out.println("|         DATA KOSONG         |");
                        System.out.println("===============================");
                    // Jika ada daftar anggota DPR
                    } else {
                        System.out.println();
                        System.out.println("===============================");
                        System.out.println("|      DATA ANGGOTA DPR       |");
                        System.out.println("===============================");
                    }

                    // Instansiasi objek tabel
                    Tabel tab = new Tabel();    
                    tab.setBaris(listDPR.size()+1);   
                    tab.setKolom(4);

                    // Instansiasi objek array menyimpan list data anggota DPR
                    String[][] arrStr = new String[listDPR.size()+1][4];    
                    
                    // Isi array pertama dengan judul pada setiap kolom
                    arrStr[0][0] = "ID";
                    arrStr[0][1] = "Nama";
                    arrStr[0][2] = "Bidang";
                    arrStr[0][3] = "Partai"; 
                    
                    // Melakukan pengisian pada setiap elemen array dari list anggota DPR
                    for(i = 0; i < listDPR.size(); i++) {
                        arrStr[i+1][0] = "" + listDPR.get(i).get_id();
                        arrStr[i+1][1] = "" + listDPR.get(i).get_nama();
                        arrStr[i+1][2] = "" + listDPR.get(i).get_bidang();
                        arrStr[i+1][3] = "" + listDPR.get(i).get_partai();
                    }
                    
                    // Menampilkan data anggota DPR
                    tab.buatTabel(arrStr, tab.getBaris(), tab.getKolom());
                    System.out.println();
                break;
            }

        } while(query != 5);    // Jika masukan query 5 keluar program

        // Menampilkan pesan setelah keluar dari looping
        System.out.println();
        System.out.println("===================================");
        System.out.println("|          TERIMA KASIH!          |");
        System.out.println("|   SEMOGA HARI-HARIMU BAHAGIA!   |");
        System.out.println("===================================");
    }
}
