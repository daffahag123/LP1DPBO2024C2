/* 
    Saya Daffa Fakhry Anshori dengan NIM 2200337 mengerjakan soal Latihan 1 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

// Import Library dan File 
#include <bits/stdc++.h>
#include "DPR.cpp"

// Menggunakan namespace standar
using namespace std;

int main() {
    // Instansiasi konstruktor
    DPR anggota;        // Membuat objek DPR bernama 'anggota'
    list<DPR> llist;    // Membuat list untuk menyimpan objek DPR

    // Deklarasi atribut
    int i = 0, n = 0, query = 0;
    string cari;
    string id, nama, bidang, partai;
    
    // Memulai loop untuk melakukan query
    do {
        // Menampilkan daftar query
        cout << "==============================" << '\n';
        cout << "|        DAFTAR QUERY        |" << '\n';
        cout << "==============================" << '\n';
        cout << "1. Tambah Data" << '\n';
        cout << "2. Ubah Data" << '\n';
        cout << "3. Hapus Data" << '\n';
        cout << "4. Tampil Data" << '\n';
        cout << "5. Keluar" << '\n';
        cout << "==============================" << "\n\n";

        // Membaca input query
        cout << "Pilih nomor query: ";
        cin >> query;

        // Memeriksa apakah query berada di luar rentang yang valid 
        if(query > 5 && query == 0) {
            cout << "Query tidak ada" << '\n';
        }

        // Melakukan switch berdasarkan query yang dipilih 
        switch(query) {
            // Menambah data anggota DPR
            case 1:
                cout << "\n==============================" << '\n';
                cout << "| Masukkan Data Anggota DPR! |" << '\n';
                cout << "==============================" << '\n';
                cout << "- ID : ";
                cin >> id;
                cout << "- Nama : ";
                cin >> nama;
                cout << "- Bidang : ";
                cin >> bidang;
                cout << "- Partai : ";
                cin >> partai;
                cout << "==============================" << "\n\n";

                // Mengatur nilai atribut anggota DPR
                anggota.set_id(id);
                anggota.set_nama(nama);
                anggota.set_bidang(bidang);
                anggota.set_partai(partai);

                // Menambahkan anggota DPR ke dalam list
                llist.push_back(anggota);

                cout << "SUCCESS!" << '\n';
                cout << "Data Berhasil Ditambahkan!" << "\n\n";
            break;

            // Mengubah data anggota DPR
            case 2:
                cout << "\nMasukkan ID Anggota DPR yang ingin diubah datanya : " << '\n';
                cin >> cari;

                // Melakukan iterasi melalui list untuk mencari anggota DPR dengan ID yang sesuai
                for(list<DPR>::iterator it = llist.begin(); it != llist.end(); it++) {
                    // Memeriksa apakah ID anggota DPR yang ditemukan dalam list sesuai dengan ID yang dicari
                    // Jika iya, Lakukan:
                    if(it->get_id() == cari) {
                        cout << "\nID ditemukan! Silahkan mengubah data!" << '\n';
                        cout << "\n==============================" << '\n';
                        cout << "|    Ubah Data Anggota DPR   |" << '\n';
                        cout << "==============================" << '\n';
                        cout << "- Ubah Nama : ";
                        cin >> nama;
                        cout << "- Ubah Bidang : ";
                        cin >> bidang;
                        cout << "- Ubah Partai : ";
                        cin >> partai;
                        cout << "==============================" << "\n\n";

                        // Mengubah nilai atribut anggota DPR yang sesuai
                        it->set_nama(nama);
                        it->set_bidang(bidang);
                        it->set_partai(partai);

                        cout << "SUCCESS!" << '\n';
                        cout << "Data Berhasil Diperbaharui!" << "\n\n";
                    // Jika tidak, Lakukan:
                    } else {
                        cout << "\nError: Terjadi kesalahan saat mencoba mengubah data. ID tidak ditemukan." << "\n\n";
                    }
                }
            break;

            // Menghapus data anggota DPR
            case 3:
                cout << "\nMasukkan ID yang ingin dihapus : " << '\n';
                cin >> cari;

                // Melakukan iterasi melalui list untuk mencari anggota DPR dengan ID yang sesuai
                for(list<DPR>::iterator it = llist.begin(); it != llist.end(); it++) {
                    // Memeriksa apakah ID ditemukan
                    // Jika iya, Lakukan:
                    if(it->get_id() == cari) {
                        llist.erase(it);    // Menghapus anggota DPR dari list
                        it = llist.end();   // Menghentikan iterasi 

                        cout << "\nSUCCESS!" << '\n';
                        cout << "Data Berhasil Dihapus!" << "\n\n";
                    // Jika tidak, Lakukan:
                    } else {
                        cout << "\nError: Terjadi kesalahan saat mencoba mengubah data. ID tidak ditemukan." << "\n\n";
                    }
                }
            break;

            // Menampilkan data anggota DPR
            case 4:
                // Memeriksa apakah list kosong
                // Jika iya, Lakukan:
                if(llist.size() == 0) {
                    cout << "\n==============================" << '\n';
                    cout << "|         DATA KOSONG        |" << '\n';
                    cout << "==============================" << '\n';
                // Jika tidak, Lakukan:
                } else {
                    cout << "\n==============================" << '\n';
                    cout << "|       DATA ANGGOTA DPR     |" << '\n';
                    cout << "==============================" << '\n';
                }

                // Menampilkan data setiap anggota DPR dalam list
                for(list<DPR>::iterator it = llist.begin(); it != llist.end(); it++) {
                    cout << "- ID : " << it->get_id() << '\n';
                    cout << "- Nama : " << it->get_nama() << '\n';
                    cout << "- Bidang : " << it->get_bidang() << '\n';
                    cout << "- Partai : " << it->get_partai() << '\n'; 
                    cout << "==============================" << '\n';                  
                }
                cout << '\n';
            break;
        }
    } while(query != 5);    // Melakukan loop sampai user memilih keluar

    // Menampilkan pesan terima kasih setelah keluar dari looping
    cout << "\n===================================" << '\n';
    cout << "|          TERIMA KASIH!          |" << '\n';
    cout << "|   SEMOGA HARI-HARIMU BAHAGIA!   |" << '\n';
    cout << "===================================" << '\n';

    return 0;
}