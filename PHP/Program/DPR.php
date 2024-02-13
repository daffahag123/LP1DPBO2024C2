<!-- /*
    Saya Daffa Fakhry Anshori dengan NIM 2200337 mengerjakan soal Latihan 1 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/ -->

<?php

class DPR {
    // Atribut private
    private $id = "";       // ID anggota DPR
    private $nama = "";     // Nama anggota DPR
    private $bidang = "";   // Bidang tugas anggota DPR
    private $foto = "";     // Partai politik anggota DPR
    private $partai = "";   // Foto anggota DPR

    // Konstruktor
    public function __construct($id = "", $nama = "", $bidang = "", $partai = "", $foto = "") {
       $this->id = $id;         // Inisialisasi ID dengan nilai dari parameter
       $this->nama = $nama;     // Inisialisasi nama dengan nilai dari parameter
       $this->bidang = $bidang; // Inisialisasi bidang dengan nilai dari parameter
       $this->partai = $partai; // Inisialisasi partai dengan nilai dari parameter
       $this->foto = $foto;     // Inisialisasi foto dengan nilai dari parameter
    }

    /* Getter and Setter */

    // Set id
    public function set_id($id) {
        $this->id = $id;            // Mengatur nilai ID
    }
    // Get id
    public function get_id() {
        return $this->id;           // Mendapatkan nilai ID
    }

    // Set nama
    public function set_nama($nama) {
        $this->nama = $nama;        // Mengatur nilai nama
    }
    // Get nama
    public function get_nama() {
        return $this->nama;         // Mendapatkan nilai nama
    }

    // Set bidang
    public function set_bidang($bidang) {
        $this->bidang = $bidang;    // Mengatur nilai bidang
    }
    // Get bidang
    public function get_bidang() {
        return $this->bidang;       // Mendapatkan nilai bidang
    }       

    // Set partai
    public function set_partai($partai) {
        $this->partai = $partai;    // Mengatur nilai partai
    }
    // Get partai
    public function get_partai() {
        return $this->partai;       // Mendapatkan nilai partai
    }

    // Set foto
    public function set_foto($foto) {
        $this->foto = $foto;        // Mengatur nilai foto
    }
    // Get foto
    public function get_foto() {
        return $this->foto;         // Mendapatkan nilai foto
    }   

    // Method untuk menampilkan daftar anggota DPR
    public function daftarDPR() {
        echo "<tr>";
        echo "<td>{$this->id}</td>";
        echo "<td>{$this->nama}</td>";
        echo "<td>{$this->bidang}</td>";
        echo "<td>{$this->partai}</td>";
        echo "<td><img src='{$this->foto}' height='25' width='25' ></td>";
        echo "</tr>";
    }

    /* Tidak ada Destruktor */
}

?>
