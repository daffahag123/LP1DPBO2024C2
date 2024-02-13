#    Saya Daffa Fakhry Anshori dengan NIM 2200337 mengerjakan soal Latihan 1 
#    dalam Praktikum mata kuliah Desain dan Pemrograman Berbasis Objek, untuk keberkahan-Nya
#    maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamin.

class DPR: 
    # Atribut private
    __id = ""       # ID anggota DPR
    __nama = ""     # Nama anggota DPR
    __bidang = ""   # Bidang tugas anggota DPR
    __partai = ""   # Partai Politik anggota DPR
    
    # Konstruktor parameter
    def __init__(self, id="", nama="", bidang="", partai=""):
        self.__id = id              # Menginisialisasi ID dengan nilai dari parameter
        self.__nama = nama          # Menginisialisasi nama dengan nilai dari parameter
        self.__bidang = bidang      # Menginisialisasi bidang dengan nilai dari parameter
        self.__partai = partai      # Menginisialisasi partai dengan nilai dari parameter
        
    # Getter & Setter
    
    # Set untuk id
    def set_id(self, id):
        self.__id = id
    # Get untuk id
    def get_id(self):
        return self.__id

    # Set untuk nama
    def set_nama(self, nama):
        self.__nama = nama
    # Get untuk nama
    def get_nama(self):
        return self.__nama

    # Set untuk bidang
    def set_bidang(self, bidang):
        self.__bidang = bidang
    # Get untuk bidang
    def get_bidang(self):
        return self.__bidang

    # Set untuk partai
    def set_partai(self, partai):
        self.__partai = partai
    # Get untuk partai
    def get_partai(self):
        return self.__partai
    
    # Tidak ada Destruktor 