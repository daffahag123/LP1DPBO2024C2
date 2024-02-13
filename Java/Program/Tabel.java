/* 
    Saya Daffa Fakhry Anshori dengan NIM 2200337 mengerjakan soal Latihan 1 
    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.
*/
public class Tabel {
    private int baris;  // Menyimpan jumlah baris tabel
    private int kolom;  // Menyimpan jumlah kolom tabel

    // Konstruktor default
    Tabel() {
        // Konstruktor kosong, tidak melakukan inisialisasi awal
    }

    // Konstruktor dengan parameter untuk menginisialisasi baris dan kolom tabel
    Tabel(int baris, int kolom) {
        this.baris = baris;  // Mengatur jumlah baris
        this.kolom = kolom;  // Mengatur jumlah kolom
    }

    /* Metode Get & Set */

    // Set jumlah baris tabel
    public void setBaris(int b) {
        this.baris = b;     // Mengatur jumlah baris
    }
    
    // Mendapatkan jumlah baris tabel
    int getBaris() {
        return this.baris;  // Mengembalikan jumlah baris
    }

    // Set jumlah kolom tabel
    public void setKolom(int k) {
        this.kolom = k;     // Mengatur jumlah kolom
    }
    
    // Mendapatkan jumlah kolom tabel
    int getKolom() {
        return this.kolom;  // Mengembalikan jumlah kolom
    }

    // Metode untuk membuat tabel dengan isi tertentu
    public void buatTabel(String[][] isi, int baris, int kolom) {
        // Inisialisasi variabel
        int i = 0;
        int j = 0;
        int k = 0;

        // Mencari panjang maksimum dari setiap kolom untuk penampilan yang rapi
        int[] panjangMax = new int[kolom]; 
        for(i = 0; i < kolom; i++) {
            panjangMax[i] = 0;
            for(j = 0; j < baris; j++) {
                int panjangKata = isi[j][i].length();
                if(panjangKata > panjangMax[i]) {
                    panjangMax[i] = panjangKata;
                }
            }
        }

        // Menampilkan tabel
        for(i = 0; i < baris; i++) {
            // Membuat baris untuk bagian pembuka
            for(j = 0; j < kolom; j++) {
                System.out.print("==");     // Tanda pembatas awal
                for(k = 0; k < panjangMax[j]; k++) {
                    System.out.print("=");  // Karakter pembatas tambahan
                }
                System.out.print("=");      // Tanda pembatas akhir
            }
            System.out.println("=");        // Akhiri baris pembuka

            // Membuat baris untuk bagian isi
            for(j = 0; j < kolom; j++) {
                System.out.print("| ");     // Tanda pembatas awal
                System.out.print(isi[i][j]);  // Menampilkan isi tabel
                for(k = 0; k < panjangMax[j] - isi[i][j].length(); k++) {
                    System.out.print(" ");  // Menambahkan spasi untuk penampilan rapi
                }
                System.out.print(" ");      // Tanda pembatas akhir
            }
            System.out.println("|");        // Akhiri baris isi
        }

        // Membuat baris untuk bagian penutup tabel
        for(j = 0; j < kolom; j++) {
            System.out.print("==");     // Tanda pembatas awal
            for(k = 0; k < panjangMax[j]; k++) {
                System.out.print("=");  // Karakter pembatas tambahan
            }
            System.out.print("=");      // Tanda pembatas akhir
        }
        System.out.println("=");        // Akhiri baris penutup
    }
}
