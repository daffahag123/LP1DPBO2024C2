<!-- /*
    Saya Daffa Fakhry Anshori dengan NIM 2200337 mengerjakan soal Latihan 1 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/ -->

<?php
    require('DPR.php');

    // Membuat & Mengisi Objek DPR 
    $dpr1 = new DPR("001", "Daffa Fakhry Anshori", "Hukum", "PDIP", "../Foto/daffa.jpg");
    $dpr2 = new DPR("002", "Annisa Heriyani Putri", "Pertahanan", "Gerindra", "../Foto/annisa.jpeg");
    $dpr3 = new DPR("003", "Rai Aria Yudistira", "Pendidikan", "PKS", "../Foto/rai.jpeg");

    // Memasukan nilai objek ke dalam array
    $listDPR = array();
    array_push($listDPR, $dpr1);
    array_push($listDPR, $dpr2);
    array_push($listDPR, $dpr3);

    // Membuat Tabel
    echo "<br>";
    echo "<table border=1>";
    echo "<caption>Daftar Anggota DPR</caption>";
    echo "<tr>";
    echo "<th>ID</th>";
    echo "<th>Nama</th>";
    echo "<th>Bidang</th>";
    echo "<th>Partai</th>";
    echo "<th>Foto</th>";
    echo "</tr>";

    // Isi Tabel
    foreach ($listDPR as $row) {
        $row->daftarDPR();
    }

    // Menampilkan pesan sukses
    echo "</table>";
    echo "Data berhasil ditambahkan!";
    echo "<br>";

    // Mengubah data anggota DPR
    foreach ($listDPR as $row) {
        if($row->get_id() == "001") {
            $row->set_nama("Daffa Ganteng");
            $row->set_bidang("Kelautan");
            $row->set_partai("Golkar");
        }
    }

    // Membuat Tabel
    echo "<br>";
    echo "<table border=1>";
    echo "<caption>Daftar Anggota DPR</caption>";
    echo "<tr>";
    echo "<th>ID</th>";
    echo "<th>Nama</th>";
    echo "<th>Bidang</th>";
    echo "<th>Partai</th>";
    echo "<th>Foto</th>";
    echo "</tr>";

    // Isi Tabel
    foreach ($listDPR as $row) {
        $row->daftarDPR();
    }

    // Menampilkan pesan sukses
    echo "</table>";
    echo "Data dengan ID 001 berhasil diubah!";
    echo "<br>";

    // Menghapus data anggota DPR
    foreach ($listDPR as $index => $row) {
        if($row->get_id() == "003") {
            unset($listDPR[$index]);
        }
    }

    // Membuat Tabel
    echo "<br>";
    echo "<table border=1>";
    echo "<caption>Daftar Anggota DPR</caption>";
    echo "<tr>";
    echo "<th>ID</th>";
    echo "<th>Nama</th>";
    echo "<th>Bidang</th>";
    echo "<th>Partai</th>";
    echo "<th>Foto</th>";
    echo "</tr>";

    // Isi Tabel
    foreach ($listDPR as $row) {
        $row->daftarDPR();
    }

    // Menampilkan pesan sukses
    echo "</table>";
    echo "Data dengan ID 003 berhasil dihapus!";
    echo "<br>";

?>