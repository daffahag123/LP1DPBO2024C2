#   Saya Daffa Fakhry Anshori dengan NIM 2200337 mengerjakan soal Latihan 1 
#    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
#    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.

class Tabel:
    # Konstruktor default
    def __init__(self):
        self.__baris = 0  # Banyaknya baris
        self.__kolom = 0  # Banyaknya kolom
        
    # Getter & Setter

    # Set baris tabel
    def setBaris(self, baris):
        self.__baris = baris
    # Get baris tabel
    def getBaris(self):
        return self.__baris

    # Set kolom tabel
    def setKolom(self, kolom):
        self.__kolom = kolom
    # Get kolom tabel
    def getKolom(self):
        return self.__kolom

    # Metode untuk membuat tabel dengan isi tertentu
    def buatTabel(self, isi, baris, kolom):
        # Inisialisasi kata terpanjang sebanyak kolom
        # Indeks dalam array diset 0 semua
        panjangMax = [0] * self.__kolom

        # Mencari kata terpanjang dari setiap kolom
        for i in range(self.__kolom):
            for j in range(self.__baris):
                panjangKata = len(isi[j][i])
                if panjangKata > panjangMax[i]:
                    panjangMax[i] = panjangKata

        # Menampilkan tabel
        for i in range(self.__baris):
            # Buat baris bagian pembuka
            for j in range(self.__kolom):
                print("==", end="")             # Tanda pembatas awal
                for k in range(panjangMax[j]):  
                    print("=", end="")          # Karakter pembatas tambahan
                print("=", end="")              # Tanda pembatas akhir
            print("=")                          # Akhiri baris pembuka

            # Buat baris bagian isi
            for j in range(self.__kolom):
                print("| ", end="")             # Tanda pembatas awal
                print(isi[i][j], end="")        # Menampilkan isi tabel
                for k in range(panjangMax[j] - len(isi[i][j])):
                    print(" ", end="")          # Menambahkan spasi untuk penampilan rapi
                print(" ", end="")              # Tanda pembatas akhir
            print("|")                          # Akhiri baris isi

        # Buat baris bagian penutup
        for j in range(self.__kolom):
            print("==", end="")             # Tanda pembatas awal
            for k in range(panjangMax[j]):  
                print("=", end="")          # Karakter pembatas tambahan
            print("=", end="")              # Tanda pembatas akhir
        print("=")                          # Akhiri baris pembuka

    