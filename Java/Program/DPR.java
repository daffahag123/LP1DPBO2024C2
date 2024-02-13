/* 
    Saya Daffa Fakhry Anshori dengan NIM 2200337 mengerjakan soal Latihan 1 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/

// Deklarasi kelas
public class DPR {
    // Atribut private
    private String id;      // ID anggota DPR
    private String nama;    // Nama anggota DPR
    private String bidang;  // Bidang tugas anggota DPR
    private String partai;  // Partai politik anggota DPR

    /* Konstruktor */

    // Konstruktor default
    public DPR() {
        this.id = "";       // Inisialisasi ID dengan string kosong
        this.nama = "";     // Inisialisasi nama dengan string kosong
        this.bidang = "";   // Inisialisasi bidang dengan string kosong
        this.partai = "";   // Inisialisasi partai dengan string kosong
    }

    // Konstruktor parameter
    public DPR(String id, String nama, String bidang, String partai) {
       this.id = id;            // Menginisialisasi ID dengan nilai dari parameter
       this.nama = nama;        // Menginisialisasi nama dengan nilai dari parameter
       this.bidang = bidang;    // Menginisialisasi bidang dengan nilai dari parameter
       this.partai = partai;    // Menginisialisasi partai dengan nilai dari parameter
    }

    /* Getter and Setter */

    // Set id
    public void set_id(String id) {
        this.id = id;        // Mengatur nilai ID
    }
    // Get id
    public String get_id() {
        return this.id;      // Mendapatkan nilai ID
    }

    // Set nama
    public void set_nama(String nama) {
        this.nama = nama;    // Mengatur nilai nama
    }
    // Get nama
    public String get_nama() {
        return this.nama;    // Mendapatkan nilai nama
    }

    // Set bidang
    public void set_bidang(String bidang) {
        this.bidang = bidang; // Mengatur nilai bidang
    }
    // Get bidang
    public String get_bidang() {
        return this.bidang;  // Mendapatkan nilai bidang
    }

    // Set partai
    public void set_partai(String partai) {
        this.partai = partai; // Mengatur nilai partai
    }
    // Get partai
    public String get_partai() {
        return this.partai;   // Mendapatkan nilai partai
    }

    /* Tidak ada Destruktor */
}