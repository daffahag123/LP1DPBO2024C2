/* 
    Saya Daffa Fakhry Anshori dengan NIM 2200337 mengerjakan soal Latihan 1 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

// Import Library
#include <iostream>
#include <string>

// Menggunakan namespace standar
using namespace std;

// Deklarasi kelas
// Huruf pertama class tidak harus kapital, tetapi lebih baik sehingga dapat membedakannya dengan jenis lainnya.
class DPR {
    // Atribut private
    private:
        string id;
        string nama;
        string bidang;
        string partai;

    // Method public
    public:
        /* Konstruktor */

        // Konstruktor default. Perhatikan bahwa itu tidak memiliki jenis pengembalian
        DPR() {
            // Set atribut objek "this" dengan nilai default
            this->id = "";
            this->nama = "";
            this->bidang = "";
            this->partai = "";
        }

        // Konstruktor parameter. Akan dipanggil jika objek dicontohkan dengan parameter yang diberikan
        DPR(string nama, char gender) {
            // Set atribut objek "this" dengan atribut parameter yang diberikan
            this->id = id;
            this->nama = nama;
            this->bidang = bidang;
            this->partai = partai;
            
        }

        /* Getter and Setter */

        // Set id
        void set_id(string id) {
            this->id = id;
        }
        // Get id
        string get_id() {
            return this->id;
        }

        // Set nama
        void set_nama(string nama) {
            this->nama = nama;
        }
        // Get nama 
        string get_nama() {
            return this->nama;
        }

        // Set nama bidang
        void set_bidang(string bidang) {
            this->bidang = bidang;
        }
        // Get nama bidang
        string get_bidang() {
            return this->bidang;
        }

        // Set nama partai
        void set_partai(string partai) {
            this->partai = partai;
        }
        // Get nama partai
        string get_partai() {
            return this->partai;
        }

        /* Destruktor */

        // Default destruktor
        ~DPR() {
            
        }




};