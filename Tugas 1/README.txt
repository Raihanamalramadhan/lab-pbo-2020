PENJELASAN DARI TUGAS 1:

1.  Class Penumpang
	- pada class ini, terdapat entitas penumpang bus
	- jadi pada Class ini,objeknya penumpang yang nantinya akan mewakili satu penumpang
	- Attribut penumpang yaitu nama, umur, dan status hamil
	- Method Penumpang() merupakan method constructor yang akan memberikan nilai awal kepada attribute.
	- Method getNama(), getUmur(), dan getHamil() adalah method accessor yang mengembalikan nilai yang diminta.

2.  Class Bus
	- pada class ini, entitasnya adalah bus
	- lalu pada class ini memiliki attribute berupa objek dari Class Penumpang
	- pada attribute penumpangBasa berisi penumpang biasa yang jumlah min 0 dan max 4
	- pada attribute penumpangPrioritas berisi penumpang prioritas yang jumlah min 0 dan max 2
	- ada dua pilihan untuk menampung data penumpak, mau menggunakan Struktur data Array ataupun ArrayList
	- pada Method getPenumpan() ini digunakan untuk mengembalikan list penumpang yang diminta.
	- pada Method getJumlahPenumpang() ini digunakan untuk mengembalikan jumlah penumpang yang diminta.
	- pada Method NaikPenumpang() ini digunakan  untuk menambahkan penumpang ke dalam Bus apabila jika ada kursi untuk penumpang tersebut. 
	- pada Method ini akan mengembalikan false jika penumpang tidak bias naik dan akan mengembalikan true jika penumpang berhasil naik dan menambahkan penumpang tsb ke dalam Array penumpang tersebut. 
	- pada Method turunkanPenumpang(nama) ini nantinya akan menerima parameter nama penumpag. Jika nama penumpang ditemukan, maka hapus penumpang tersebut dari Array penumpang dan kembalikan nilai true. Sebaliknya, kembalikan false.
	- pada Method  toString()  ini digunakan untuk  mencetak  daftar  nama  Penumpang  Biasa,  Penumpang Prioritas, dan Jumlah semua penumpang yang akan menaiki bus.

3.  Class Main
	- Pada method main() ini akan dideklarasikan sebuah objek Bus dan pada method ini anda akan mensimulasikan proses naik dan turunnya penumpang dari bus tersebut.


Proses Run The Program
	- langkah awal saya menggunakan apk BlueJ. oleh karena kita buka terlebih dahulu blue j nya
	- setelah itu baru kita ciptakan kode dari tugas 1 yang telah diberikan.
	- pada tugas ini ada class diciptakan yaitu ada class Main.java, Penumpang.java dan Bus.java
	- lalu setelah saya membuatnya, lalu saya mengcompilenya untuk melihat lihat apakah ada eror atau tidak.
	- apabila tidak error atau sudah berhasil maka balik ke home
	- di Class Main kita klick kanan lalu pilih void main () lalu oke 
	- Setalah itu muncul hasil output yang telah kita buat dari kode yang kita buat 
	- Pilih cara bermain dari setiap menu tersebut 
	- dan tamat.

INSTALISASI

$ cd Tugas 1

$ ls
  Bus.java
  Penumpang.java
  Main.java

*//Compile
$javac Bus.java
$javac Penumpang.java
$javac Main.java

*//Run
$java Bus
$java Penumpang
$java Main
