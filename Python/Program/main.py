# Import file class
from DPR import DPR
from Tabel import Tabel

# Instansiasi konstruktor
anggota = DPR() # Inisialisasi objek DPR
listDPR = []    # Inisialisasi list

# Fungsi Tambah Data
def insert():
    # Menampilkan tabel untuk masukan data
    print("")
    print("===============================")
    print("| Masukkan Data Anggota DPR!  |")
    print("===============================")
    id = input("- ID     : ")
    nama = input("- Nama   : ")
    bidang = input("- Bidang : ")
    partai = input("- Partai : ")
    print("===============================")
    print()
    
    # Menambahkan anggota DPR ke dalam list
    listDPR.append(DPR(id, nama, bidang, partai))
    
    # Menampilkan pesan berhasil
    print("SUCCESS!") 
    print("Data Berhasil Ditambahkan!")
    print("")
    
# Fungsi Ubah Data
def update():
    # Menampilkan teks untuk meminta masukan ID yang ingin diubah datanya
    print("")
    print("Masukkan ID Anggota DPR yang ingin diubah datanya :")
    # Meminta masukan ID
    cari = input()
    ketemu = 0
    
    # Melakukan iterasi melalui list untuk mencari anggota DPR dengan ID yang sesuai
    for DPR in listDPR:
        # Memeriksa apakah ID anggota DPR yang ditemukan dalam list sesuai dengan ID yang dicari
        # Jika iya, Lakukan:
        if DPR.get_id() == cari:
            # Menampilkan tabel untuk mengubah data
            print("")
            print("ID ditemukan! Silahkan mengubah data!")
            print("")
            print("===============================")
            print("|    Ubah Data Anggota DPR    |")
            print("===============================")
            nama = input("- Ubah Nama   : ")
            bidang = input("- Ubah bidang : ")
            partai = input("- Ubah Partai : ")
            print("===============================")
            print("")
            
            # Mengubah nilai atribut anggota DPR yang sesuai
            DPR.set_nama(nama)
            DPR.set_bidang(bidang)
            DPR.set_partai(partai)

            # Menampilkan pesan sukses
            print("SUCCESS!")
            print("Data Berhasil Diperbaharui!")
            print("")
            
            # Data berhasil diperbaharui
            ketemu = 1
    
    # Jika tidak ada perubahan data / tidak ditemukan ID yang ingin dicari
    if ketemu == 0:
        # Menampilkan pesan error
        print("")
        print("Error: Terjadi kesalahan saat mencoba mengubah data. ID tidak ditemukan.")
        print("")
        
# Fungsi Hapus Data
def delete():
    # // Menampilkan teks untuk meminta masukan ID yang ingin dihapus datanya
    print("")
    print("Masukkan ID yang ingin dihapus :")
    # Meminta masukan ID
    cari = input()
    ketemu = 0
    
    # Melakukan iterasi melalui list untuk mencari anggota DPR dengan ID yang sesuai
    for DPR in listDPR:
        # Memeriksa apakah ID ditemukan
        # Jika iya, Lakukan: 
        if DPR.get_id() == cari:
            # Melakukan penghapusan data
            listDPR.remove(DPR)
            
            # Menampilkan pesan sukses
            print("")
            print("SUCCESS!")
            print("Data Berhasil Dihapus!")
            print("")
            
            # Data berhasil dihapus
            ketemu = 1
            
    # Jika tidak ada penghapusan data / tidak ditemukan ID yang ingin dicari
    if ketemu == 0:
        # Menampilkan pesan error
        print("")
        print("Error: Terjadi kesalahan saat mencoba menghapus data. ID tidak ditemukan.")
        print("")
     
# Fungsi Tampil Data       
def display():  
    # Jika tidak ada daftar anggota DPR
    if len(listDPR) == 0:
        print("")
        print("===============================")
        print("|         DATA KOSONG         |")
        print("===============================")
    # Jika ada daftar anggota DPR
    else:
        print("")
        print("===============================")
        print("|      DATA ANGGOTA DPR       |")
        print("===============================")
        
    # Instansiasi objek tabel
    tab = Tabel()
    tab.setBaris(len(listDPR) + 1)  
    tab.setKolom(4)  
    
    # Instansiasi objek array menyimpan list data anggota DPR
    # Isi array pertama dengan judul pada setiap kolom
    arrStr = [["ID", "Nama", "Bidang", "Partai"]]
    
    # Melakukan pengisian pada setiap elemen array dari list anggota DPR
    for DPR in listDPR:
        arrStr.append([DPR.get_id(), DPR.get_nama(), DPR.get_bidang(), DPR.get_partai()])
        
    # Menampilkan data anggota DPR
    tab.buatTabel(arrStr, tab.getBaris(), tab.getKolom())
    print("")
    
# Masuk ke Program
# Inisialisasi query awal diset 0, agar masuk ke dalam perulangan
query = 0

# Perulangan selama tidak input query 5
while query != 5:
    print("===============================")
    print("|         DAFTAR QUERY        |")
    print("===============================")
    print("1. Tambah Data") 
    print("2. Ubah Data") 
    print("3. Hapus Data") 
    print("4. Tampil Data")  
    print("5. Keluar") 
    print("===============================")
    print()
    
    # Input query
    query = int(input("Pilih nomor query : "))

    # Jika memilih query selain dari pilihan
    if query > 5 and query == 0:
        print("Query tidak ada")

    # Pilihan 1 : Tambah Data
    if query == 1:
        insert()
    # Pilihan 2 : Ubah Data
    elif query == 2:
        update()
    # Pilihan 3 : Hapus Data
    elif query == 3:
        delete()
    # Pilihan 4 : Tampil Data
    elif query == 4:
        display()
        
# Menampilkan pesan setelah keluar dari looping
print("")
print("===================================")
print("|          TERIMA KASIH!          |")
print("|   SEMOGA HARI-HARIMU BAHAGIA!   |")
print("===================================")

